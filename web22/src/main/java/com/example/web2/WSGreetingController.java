package com.example.web2;

import com.example.websockets.GreetingMessage;
import com.example.websockets.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class WSGreetingController {
    @MessageMapping("/hello1")
    @SendTo("/topic/greetings1")
    public GreetingMessage greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new GreetingMessage("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
