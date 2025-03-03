package eu.noWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private IEngine dieselEngine;

    public void setDieselEngine(IEngine dieselEngine) {
        this.dieselEngine = dieselEngine;
    }

    public void drive(){
        System.out.println(dieselEngine.start());
    }
}
