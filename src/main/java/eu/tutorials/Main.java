package eu.tutorials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        //ApplicationContext myAppContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //for (String beanName : myAppContext.getBeanDefinitionNames()) {
          //  System.out.println(beanName);
        //}

        //NotificationService notificationService = myAppContext.getBean(NotificationService.class);
        //notificationService.notifyUser("ath@gmail.com");

        //
        SpringApplication.run(Main.class, args);

    }
}
