package eu.annotationSample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        //ApplicationContext context = SpringApplication.run(MainApp.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig_.class);

        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}
