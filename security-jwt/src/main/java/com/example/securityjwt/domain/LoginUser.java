package com.example.securityjwt.domain;

import lombok.Data;

@Data
public class LoginUser {

    private String username;
    private String password;
    private Integer rememberMe;
}
