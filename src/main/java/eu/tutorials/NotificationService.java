package eu.tutorials;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class NotificationService {
    @Autowired      //Field Injection
    private EmailService emailService;

    //Constructor Injection
    //public NotificationService(EmailService emailService) {
      //  this.emailService = emailService;
    //}

    public void notifyUser(String userEmail){
        String subject = "Welcome!";
        String body = "Thank you for registering with our service!";
        emailService.sendEmail(userEmail, subject, body);
    }
}
