package DI.Primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingController {

    //Field DI
    @Autowired
    private IGreetingService greetingService;

    public void deliverGreeting() {
        System.out.println(greetingService.greet());
    }
}
