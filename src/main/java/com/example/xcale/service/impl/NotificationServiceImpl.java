package com.example.xcale.service.impl;

import com.example.xcale.model.Contact;
import com.example.xcale.model.Message;
import com.example.xcale.model.Notification;
import com.example.xcale.repository.NotificationRepository;
import com.example.xcale.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    NotificationRepository notificationRepository;

    @Override
    public List<Notification> sendAll(List<Contact> members, Message message) {
        return notificationRepository.saveAll(
                members.stream()
                        .map(member-> new Notification(member, message))
                        .collect(Collectors.toList())
        );
    }
}
