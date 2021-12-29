package com.example.xcale.dto.message;

import com.example.xcale.dto.contact.ContactResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
public class MessageResponse {

    private Long id;
    private String text;
    private LocalDateTime sendAt;
    private ContactResponse sender;

}
