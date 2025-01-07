
package com.santu.Backend_Matrilab.service.impl;

import com.santu.Backend_Matrilab.dto.LoginRequest;
import com.santu.Backend_Matrilab.dto.response.Response;
import com.santu.Backend_Matrilab.dto.UserDTO;
import com.santu.Backend_Matrilab.entities.User;
import com.santu.Backend_Matrilab.exception.OurException;
import com.santu.Backend_Matrilab.repository.UserRepository;
import com.santu.Backend_Matrilab.service.interfac.IUserService;
import com.santu.Backend_Matrilab.utils.JWTUtils;
import com.santu.Backend_Matrilab.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JWTUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
        public Response register(User user) {
            Response response = new Response();

            try {
                if (user.getRole() == null || user.getRole().isBlank()) {
                    user.setRole("USER");
                }

                if (userRepository.existsByEmail(user.getEmail())) {
                    throw new OurException("Email " + user.getEmail() + " already exists.");
                }

                user.setPassword(passwordEncoder.encode(user.getPassword()));

                User savedUser = userRepository.save(user);
                UserDTO userDTO = Utils.mapUserEntityToUserDTO(savedUser);

                response.setStatusCode(200);
                response.setMessage("Registration successful.");
                response.setUser(userDTO);
                response.setUserId(userDTO.getId());
            } catch (OurException e) {
                response.setStatusCode(400);
                response.setMessage(e.getMessage());
            } catch (Exception e) {
                response.setStatusCode(500);
                response.setMessage("Error occurred during user registration: " + e.getMessage());
            }

            return response;
        }

        @Override
        public Response login(LoginRequest loginRequest) {
            Response response = new Response();

            try {
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                loginRequest.getEmail(),
                                loginRequest.getPassword()
                        )
                );

                User user = userRepository.findByEmail(loginRequest.getEmail())
                        .orElseThrow(() -> new OurException("User not found."));

                String token = jwtUtils.generateToken(user);
                UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);

                response.setStatusCode(200);
                response.setMessage("Login successful.");
                response.setToken(token);
                response.setRole(user.getRole());
                response.setExpirationTime("7 Days");
                response.setUser(userDTO);
                response.setUserId(userDTO.getId());
            } catch (OurException e) {
                response.setStatusCode(404);
                response.setMessage(e.getMessage());
            } catch (Exception e) {
                response.setStatusCode(500);
                response.setMessage("Error occurred during user login: " + e.getMessage());
            }

            return response;
        }



    @Override
    public Response getUserById(String userId) {
        Response response = new Response();

        try {
            User user = userRepository.findById(Long.valueOf(userId))
                    .orElseThrow(() -> new OurException("User not found."));
            UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);

            response.setStatusCode(200);
            response.setMessage("User fetched successfully.");
            response.setUser(userDTO);
            response.setUserId(user.getId());
        } catch (OurException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error fetching user by ID: " + e.getMessage());
        }

        return response;
    }

    @Override
    public Response getMyInfo(String email) {
        Response response = new Response();

        try {
            User user = userRepository.findByEmail(email)
                    .orElseThrow(() -> new OurException("User not found."));
            UserDTO userDTO = Utils.mapUserEntityToUserDTO(user);

            response.setStatusCode(200);
            response.setMessage("User information fetched successfully.");
            response.setUser(userDTO);
            response.setUserId(user.getId());
        } catch (OurException e) {
            response.setStatusCode(404);
            response.setMessage(e.getMessage());
        } catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage("Error fetching user information: " + e.getMessage());
        }

        return response;
    }

//    @Override
//    public Response getAllUsers() {
//        Response response = new Response();
//        try {
//            // Fetch all users from the repository
//            List<User> users = userRepository.findAll();
//
//            // Map user entities to user DTOs for cleaner response
//            List<UserDTO> userDTOs = users.stream()
//                    .map(Utils::mapUserEntityToUserDTO)
//                    .toList();
//
//            response.setStatusCode(200);
//            response.setMessage("User list fetched successfully.");
//            response.setUserList(userDTOs); // Assuming `Response` has a `userList` field for multiple users
//        } catch (Exception e) {
//            response.setStatusCode(500);
//            response.setMessage("Failed to fetch user list: " + e.getMessage());
//        }
//        return response;
//    }

    @Override
    public List<UserDTO> getAllUsers() {
        // Fetch all users and map to DTOs
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(Utils::mapUserEntityToUserDTO)
                .toList();
    }


}
