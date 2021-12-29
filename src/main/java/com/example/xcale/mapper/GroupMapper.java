package com.example.xcale.mapper;

import com.example.xcale.dto.contact.ContactResponse;
import com.example.xcale.dto.group.GroupRequest;
import com.example.xcale.dto.group.GroupResponse;
import com.example.xcale.model.Contact;
import com.example.xcale.model.Group;
import com.example.xcale.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GroupMapper {

    @Autowired
    private ContactService contactService;

    @Autowired
    private ContactMapper contactMapper;

    public GroupResponse toGroupResponse (Group group) {
        List<ContactResponse> contactResponseList = contactMapper.toContactResponseList(group.getMembers());
        return new GroupResponse(group.getId(), group.getName(), contactResponseList);
    }

    public Group toGroup(GroupRequest groupRequest) {
        Group group = new Group();
        group.setName(groupRequest.getName());
        List<Contact> members = groupRequest.getMembersId()
                .stream()
                .map(memberId -> contactService.getById(memberId))
                .collect(Collectors.toList());
        group.setMembers(members);
        return group;
    }

}
