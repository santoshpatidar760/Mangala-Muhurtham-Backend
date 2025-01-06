package com.santu.Backend_Matrilab.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.santu.Backend_Matrilab.dto.UserDTO;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int statusCode;
    private String message;
    private Long userId;
    private String token;
    private String role;
    private String expirationTime;
    private UserDTO user;
    private List<UserDTO> userList;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }


    public List<UserDTO> getUserList() {
        return userList;
    }

    public void setUserList(List<UserDTO> userList) {
        this.userList = userList;
    }

    // Constructor
    public Response() {
    }

    public Response(int statusCode, String message, String token, String role, String expirationTime, UserDTO user, Long userId, List<UserDTO> userList) {
        this.statusCode = statusCode;
        this.message = message;
        this.token = token;
        this.role = role;
        this.expirationTime = expirationTime;
        this.user = user;
        this.userId = userId;
        this.userList = userList;
    }


}
