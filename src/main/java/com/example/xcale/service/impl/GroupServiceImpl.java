package com.example.xcale.service.impl;

import com.example.xcale.exception.GroupNotFoundException;
import com.example.xcale.model.Group;
import com.example.xcale.repository.GroupRepository;
import com.example.xcale.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group create(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group getById(Long id) {
        return groupRepository.findById(id).orElseThrow(GroupNotFoundException::new);
    }
}
