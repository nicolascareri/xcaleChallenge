package com.example.xcale.service.impl;


import com.example.xcale.model.Group;
import com.example.xcale.repository.GroupRepository;
import com.example.xcale.service.GroupService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class GroupServiceImplTest {

    @Mock
    private GroupRepository groupRepository;

    @InjectMocks
    private GroupServiceImpl groupService;


    @Test
    void createTest() {
        Group group = TestUtils.getGroupMock();
        Mockito.when(groupRepository.save(Mockito.any(Group.class))).thenReturn(group);
        assertEquals(group, groupService.create(group));
    }
}