package com.example.xcale.service.impl;

import com.example.xcale.exception.ContactNotFoundException;
import com.example.xcale.model.Contact;
import com.example.xcale.repository.ContactRepository;
import com.example.xcale.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactRepository contactRepository;

    @Override
    public Contact getById(Long id) {
        return contactRepository.findById(id).orElseThrow(ContactNotFoundException::new);
    }
}
