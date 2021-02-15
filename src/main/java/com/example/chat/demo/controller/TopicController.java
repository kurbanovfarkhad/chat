package com.example.chat.demo.controller;

import com.example.chat.demo.entity.Message;
import com.example.chat.demo.model.MessageForm;
import com.example.chat.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TopicController {

    private final MessageService service;

    @Autowired
    public TopicController(MessageService service) {
        this.service = service;
    }

    @MessageMapping("/changeMessage")
    @SendTo("/topic/activity")
    public MessageForm change(MessageForm message) {
        return service.saveMessage(message);
    }
}
