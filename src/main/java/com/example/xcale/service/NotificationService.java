package com.example.xcale.service;

import com.example.xcale.model.Contact;
import com.example.xcale.model.Message;
import com.example.xcale.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> sendAll(List<Contact> members, Message message);
}
