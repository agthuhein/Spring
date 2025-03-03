package eu.autowiringByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainByName {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //Retrieve beans from the context
        Car car = context.getBean(Car.class);

        //Use the bean
        System.out.println("Starting the car...");
        car.drive();
    }
}
