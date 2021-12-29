package com.example.xcale.mapper;

import com.example.xcale.dto.contact.ContactResponse;
import com.example.xcale.model.Contact;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ContactMapper {

    public ContactResponse toContactResponse(Contact contact){
        ContactResponse contactResponse = new ContactResponse();
        contactResponse.setId(contact.getId());
        contactResponse.setFirstName(contact.getFirstName());
        contactResponse.setLastName(contact.getLastName());
        contactResponse.setPhoneNumber(contact.getPhoneNumber());
        return contactResponse;
    }

    public List<ContactResponse> toContactResponseList(List<Contact> contactList) {
        return contactList.stream()
                .map(this::toContactResponse)
                .collect(Collectors.toList());
    }

}
