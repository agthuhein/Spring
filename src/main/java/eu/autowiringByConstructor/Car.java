package eu.autowiringByConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private IEngine dieselEngine;

    //Autowire by constructor
    @Autowired
    public Car(DieselEngine engine) {
        this.dieselEngine = engine;
    }

    public void drive(){
        System.out.println(dieselEngine.start());
    }
}
