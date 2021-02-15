package com.example.chat.demo.controller;

import com.example.chat.demo.entity.Message;
import com.example.chat.demo.model.MessageForm;
import com.example.chat.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1")
public class RestMessagesController {

    private final MessageService service;

    @Autowired
    public RestMessagesController(MessageService service) {
        this.service = service;
    }

    @GetMapping("/messages")
    public List<Message> getAll() {
        return service.getAll();
    }

    @PostMapping("/message")
    public MessageForm create(@RequestBody MessageForm messageForm){
        return service.saveMessage(messageForm);
    }

    @DeleteMapping("/message")
    public Boolean delete(@RequestBody Message message){
        try {
            service.delete(message);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
