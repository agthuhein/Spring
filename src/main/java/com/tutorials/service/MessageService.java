package com.tutorials.service;

import org.springframework.stereotype.Service;

//This annotation marks this class as a Spring-managed bean
@Service
public class MessageService {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
