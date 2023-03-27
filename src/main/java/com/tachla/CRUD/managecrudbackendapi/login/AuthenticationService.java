package com.tachla.CRUD.managecrudbackendapi.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean autheticateUser(String userName, String password) {
        boolean isValidUserName =userName.equalsIgnoreCase("admin");
        boolean isValidPasword = password.equalsIgnoreCase("admin");

        return isValidUserName && isValidPasword;
    }
}
