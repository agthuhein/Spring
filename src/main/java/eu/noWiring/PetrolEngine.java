package eu.noWiring;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {
    @Override
    public String start() {
        return "PetrolEngine is starting...";
    }
}
