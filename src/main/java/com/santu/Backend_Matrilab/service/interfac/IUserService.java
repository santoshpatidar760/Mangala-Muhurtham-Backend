package com.santu.Backend_Matrilab.service.interfac;

import com.santu.Backend_Matrilab.dto.LoginRequest;
import com.santu.Backend_Matrilab.dto.response.Response;
import com.santu.Backend_Matrilab.entities.User;

public interface IUserService {
    Response register(User user);
    Response login(LoginRequest loginRequest);
    Response getUserById(String userId);
    Response getMyInfo(String email);
    Response getAllUsers();
}