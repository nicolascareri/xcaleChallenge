package com.example.xcale.controller;

import com.example.xcale.dto.group.GroupRequest;
import com.example.xcale.dto.group.GroupResponse;
import com.example.xcale.mapper.GroupMapper;
import com.example.xcale.model.Group;
import com.example.xcale.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @Autowired
    private GroupMapper groupMapper;

    @PostMapping
    public ResponseEntity<GroupResponse> create (@RequestBody @Valid GroupRequest groupRequest) {
        Group group = groupMapper.toGroup(groupRequest);
        return new ResponseEntity<>(groupMapper.toGroupResponse(groupService.create(group)), HttpStatus.CREATED);
    }

}
