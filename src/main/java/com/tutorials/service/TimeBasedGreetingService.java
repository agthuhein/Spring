package com.tutorials.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class TimeBasedGreetingService implements IGreetingService {
    private final MessageService messageService;

    @Autowired
    public TimeBasedGreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public String getGreeting() {
        String userName = messageService.getUserName();
        LocalTime now = LocalTime.now();
        String greeting;

        if(now.isBefore(LocalTime.NOON)) {
            greeting = "Good Morning";
        }
        else if(now.isBefore(LocalTime.of(18, 0))) {
            greeting = "Good Afternoon";
        }
        else {
            greeting = "Good Evening";
        }

        return greeting + ", " + userName + "!";
    }
}
