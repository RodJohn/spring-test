package com.john.test;


import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserName(){
        return "john";
    }

}
