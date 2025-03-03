package eu.autowiringByName;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements IEngine {
    @Override
    public String start() {
        return "PetrolEngine is starting...";
    }
}
