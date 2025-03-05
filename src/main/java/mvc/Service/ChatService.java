package mvc.Service;

import mvc.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatService {
    private List<Message> messageList = new ArrayList<>();

    public void sendMessage(Message message) {
        messageList.add(message);
        System.out.println(message.getSender().getName() + " sent a message to " +
                message.getReceiver().getName() + ": " + message.getContent());
    }
    public void displayChatHistory() {
        System.out.println("Chat history: ");
        for (Message message : messageList) {
            System.out.println(message.getSender().getName() + " sent a message to " +
                    message.getReceiver().getName() + ": " + message.getContent());
        }
    }
}
