package eu.autowiringByName;

import org.springframework.stereotype.Component;

@Component("dieselEngine")
public class DieselEngine implements IEngine {
    @Override
    public String start() {
        return "DieselEngine is starting...";
    }
}
