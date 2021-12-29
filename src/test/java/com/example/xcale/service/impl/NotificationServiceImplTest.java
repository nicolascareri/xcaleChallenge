package com.example.xcale.service.impl;

import com.example.xcale.model.Notification;
import com.example.xcale.repository.NotificationRepository;
import com.example.xcale.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class NotificationServiceImplTest {

    @Mock
    private NotificationRepository notificationRepository;

    @InjectMocks
    private NotificationServiceImpl notificationService;


    @Test
    void sendTest() {
        List<Notification> notifications = TestUtils.getNotificationList();
        Mockito.when(notificationRepository.saveAll(Mockito.any())).thenReturn(notifications);
        assertEquals(notifications, notificationService.sendAll(TestUtils.getGroupMock().getMembers(), TestUtils.getMessageMock()));
    }

}