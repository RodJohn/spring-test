package com.john.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceTest extends BaseTest {

    @Autowired
    UserService userService;

    @Test
    public void getUserName() {
        System.out.println(userService.getUserName());
    }
}