package com.socket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.socket.Greet.Greeting;
import com.socket.message.HelloMessage;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greet(HelloMessage message) throws InterruptedException {
//        Thread.sleep(1000);
        return new Greeting(HtmlUtils.htmlEscape(message.getName()));
    }
}