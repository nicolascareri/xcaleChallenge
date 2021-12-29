package com.example.xcale.dto.message;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class MessageRequest {

    @NotNull
    private Long groupId;
    @NotBlank
    private String text;

    /**
     * This would not be necessary in a real case because
     * the id would be included in the token that sends the request
     * with spring security
     */
    @NotNull
    private Long senderId;

}
