package PostConstruct;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SettingsLoaderService {
    private Map<String, String> settings = new HashMap<>();

    @PostConstruct
    public void loadSettings() {
        settings.put("appName", "Spring Boot Demo");
        settings.put("appVersion", "1.0.0");
        settings.put("author", "Aung Thu Hein");
        System.out.println("Settings have been loaded");
    }

    public Map<String, String> getSettings() {
        return settings;
    }
}
