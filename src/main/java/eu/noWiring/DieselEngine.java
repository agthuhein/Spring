package eu.noWiring;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {
    @Override
    public String start() {
        return "DieselEngine is starting...";
    }
}
