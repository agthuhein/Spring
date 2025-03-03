package DI.Primary;

import org.springframework.stereotype.Service;

@Service
public class CasualGreetingService implements IGreetingService {
    @Override
    public String greet() {
        return "Hey, what's up?";
    }
}
