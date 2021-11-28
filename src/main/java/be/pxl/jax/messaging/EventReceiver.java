package be.pxl.jax.messaging;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

@Service
public class EventReceiver {
    private static final String QUEUE = "authenticationqueue";


    @JmsListener(destination = QUEUE)
    public void receiveMessage(Message message) throws JMSException {
        LocalDateTime localDateTime = Instant.ofEpochMilli(message.getJMSTimestamp()).atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime + "  ERROR Received <" + ((TextMessage) message).getText() + ">");
    }
}


