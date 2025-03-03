package com.tutorials.main;

import com.tutorials.config.AppConfig;
import com.tutorials.service.IGreetingService;
import com.tutorials.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        MessageService messageService = context.getBean(MessageService.class);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();
        messageService.setUserName(userName);

        IGreetingService greetingService = context.getBean(IGreetingService.class);
        String personalizedGreeting = greetingService.getGreeting();
        System.out.println(personalizedGreeting);

        scanner.close();
    }
}
