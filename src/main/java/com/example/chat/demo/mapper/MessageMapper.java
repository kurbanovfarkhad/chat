package com.example.chat.demo.mapper;

import com.example.chat.demo.entity.Message;
import com.example.chat.demo.model.MessageForm;
import com.example.chat.demo.service.MessageService;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = MessageService.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface MessageMapper extends BaseMapper<Message, MessageForm>{

    @Override
    @Mapping(target = "createdAt", source = "createdAt", ignore = true)
    Message modelToEntity(MessageForm form);
}
