package com.example.xcale.mapper;

import com.example.xcale.dto.contact.ContactResponse;
import com.example.xcale.dto.message.MessageRequest;
import com.example.xcale.dto.message.MessageResponse;
import com.example.xcale.model.Message;
import com.example.xcale.service.ContactService;
import com.example.xcale.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MessageMapper {

    @Autowired
    private GroupService groupService;

    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactMapper contactMapper;

    public Message toMessage(MessageRequest messageRequest) {
        Message message = new Message();
        message.setGroup(groupService.getById(messageRequest.getGroupId()));
        message.setText(messageRequest.getText());
        message.setSender(contactService.getById(messageRequest.getSenderId()));
        message.setSendAt(LocalDateTime.now());
        return message;
    }

    public MessageResponse toMessageReponse(Message message) {
        ContactResponse contactResponse = contactMapper.toContactResponse(message.getSender());
        return new MessageResponse(message.getId(), message.getText(), message.getSendAt(), contactResponse);
    }
}
