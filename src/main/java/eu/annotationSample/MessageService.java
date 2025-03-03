package eu.annotationSample;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage(){
        return "Hello from the messageService Bean.";
    }
}
