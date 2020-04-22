package com.example.web2;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/hello")//Слушает Java server
    @SendTo("/topic/greetings")// Слушает JS клиент
    ResponceMessage chatting(RequestMessage message){
        return new ResponceMessage("Hello "+ message.getMessage());
    }
}
