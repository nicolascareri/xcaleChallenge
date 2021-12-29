package com.example.xcale.dto.group;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Getter
@Setter
public class GroupRequest {
    @NotBlank
    private String name;
    @NotEmpty
    private List<Long> membersId;
}
