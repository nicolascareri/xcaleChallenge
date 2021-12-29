package com.example.xcale.service.impl;

import com.example.xcale.model.Message;
import com.example.xcale.repository.MessageRepository;
import com.example.xcale.service.MessageService;
import com.example.xcale.service.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MessageServiceImplTest {

    @Mock
    private MessageRepository messageRepository;

    @Mock
    private NotificationServiceImpl notificationService;

    @InjectMocks
    private MessageServiceImpl messageService;

    @Test
    void sendTest() {
        Message message = TestUtils.getMessageMock();
        Mockito.doReturn(null).when(notificationService).sendAll((Mockito.anyList()), Mockito.any());
        Mockito.when(messageRepository.save(Mockito.any(Message.class))).thenReturn(message);
        assertEquals(message, messageService.send(message));
    }

}