package com.example.chat.demo.service;

import com.example.chat.demo.entity.Message;
import com.example.chat.demo.mapper.MessageMapper;
import com.example.chat.demo.model.MessageForm;
import com.example.chat.demo.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper mapper;

    @Autowired
    public MessageService(MessageRepository messageRepository, MessageMapper mapper) {
        this.messageRepository = messageRepository;
        this.mapper = mapper;
    }

    public List<Message> getAll() {
        return messageRepository.findAll();
    }

    public Message saveMessage(MessageForm model) {
        return messageRepository.save(mapper.modelToEntity(model));
    }

    public void delete(Message message) {
        messageRepository.delete(message);
    }

}
