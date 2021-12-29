package com.example.xcale.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    private String firstName;

    private String lastName;

    /**
     * This is the user's contact list that can be used to get the name
     * if the number is present in the contact list
     */
    @ManyToMany
    private List<Contact> contacts;

    public Contact(Long id, String phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
