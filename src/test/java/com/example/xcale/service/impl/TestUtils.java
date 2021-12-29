package com.example.xcale.service.impl;

import com.example.xcale.model.Contact;
import com.example.xcale.model.Group;
import com.example.xcale.model.Message;
import com.example.xcale.model.Notification;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TestUtils {

    private static final Contact contactOne = new Contact(1L, "John", "Doe", "222-555-4444");
    private static final Contact contactTwo = new Contact(2L, "Jane", "Foo", "444-555-2222");
    private static final Contact contactThree = new Contact(3L, "Warren", "Douglas", "222-444-5555");
    private static final Contact contactFour = new Contact(4L, "Lana", "Lynn", "111-222-3333");

    public static Group getGroupMock(){
        List<Contact> contactList = Arrays.asList(
                contactOne,
                contactTwo,
                contactThree
        );
        return new Group(1L, "Friends", contactList);
    }

    public static Contact getContactMock() {
        return contactFour;
    }

    public static Message getMessageMock() {
        return new Message(1L, getGroupMock(), "Hi guys", getContactMock(), LocalDateTime.now());
    }

    public static List<Notification> getNotificationList() {
        return Arrays.asList(
                new Notification(contactOne, getMessageMock()),
                new Notification(contactTwo, getMessageMock()),
                new Notification(contactThree, getMessageMock())
        );
    }

}
