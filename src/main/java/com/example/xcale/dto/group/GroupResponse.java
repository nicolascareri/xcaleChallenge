package com.example.xcale.dto.group;

import com.example.xcale.dto.contact.ContactResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GroupResponse {

    private Long id;
    private String name;
    private List<ContactResponse> members;

}
