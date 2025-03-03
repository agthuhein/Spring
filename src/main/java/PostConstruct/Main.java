package PostConstruct;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class Main {

    @Autowired
    private SettingsLoaderService settingsLoaderService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Loaded settings. " + settingsLoaderService.getSettings());
    }
}
