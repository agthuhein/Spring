package DI.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class FormalGreetingService implements IGreetingService {
    @Override
    public String greet() {
        return "Good afternoon, sir.";
    }
}
