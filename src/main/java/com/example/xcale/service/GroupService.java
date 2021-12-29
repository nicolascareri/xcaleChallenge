package com.example.xcale.service;

import com.example.xcale.model.Group;

public interface GroupService {
    Group create(Group group);

    Group getById(Long id);
}
