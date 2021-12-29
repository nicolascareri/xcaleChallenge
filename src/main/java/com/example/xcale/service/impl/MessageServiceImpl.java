package com.example.xcale.service.impl;

import com.example.xcale.model.Message;
import com.example.xcale.repository.MessageRepository;
import com.example.xcale.service.MessageService;
import com.example.xcale.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    NotificationService notificationService;

    @Autowired
    MessageRepository messageRepository;

    @Override
    @Transactional
    public Message send(Message message) {
        notificationService.sendAll(message.getGroup().getMembers(), message);
        return messageRepository.save(message);
    }

}
