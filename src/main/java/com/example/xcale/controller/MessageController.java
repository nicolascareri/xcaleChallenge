package com.example.xcale.controller;

import com.example.xcale.dto.message.MessageRequest;
import com.example.xcale.dto.message.MessageResponse;
import com.example.xcale.mapper.MessageMapper;
import com.example.xcale.model.Message;
import com.example.xcale.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private MessageMapper messageMapper;

    @PostMapping
    public ResponseEntity<MessageResponse> send(@RequestBody @Valid MessageRequest messageRequest){
        Message message = messageMapper.toMessage(messageRequest);
        return new ResponseEntity<>(messageMapper.toMessageReponse(messageService.send(message)), HttpStatus.CREATED);
    }

}
