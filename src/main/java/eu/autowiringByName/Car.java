package eu.autowiringByName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private IEngine dieselEngine;

    public void drive(){
        System.out.println(dieselEngine.start());
    }
}
