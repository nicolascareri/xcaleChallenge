package com.example.xcale.dto.contact;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactResponse {

    private Long id;
    private String phoneNumber;
    private String firstName;
    private String lastName;

}
