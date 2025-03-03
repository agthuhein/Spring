package eu.autowiringByType;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String start(){
        return "Engine is running";
    }
}
