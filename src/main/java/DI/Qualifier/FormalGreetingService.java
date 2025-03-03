package DI.Qualifier;

import org.springframework.stereotype.Service;

@Service
public class FormalGreetingService implements IGreetingService{
    @Override
    public String greet() {
        return "Good afternoon, sir.";
    }
}
