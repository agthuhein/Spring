package eu.autowiringByType;

import eu.tutorials.EmailService;
import eu.tutorials.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("eu/autowiringByType")
public class AppConfig {

}
