package com.example.xcale.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime seenAt;

    @ManyToOne
    @JoinColumn(name = "to_id")
    private Contact to;

    @OneToOne
    @JoinColumn
    private Message message;

    public Notification(Contact to, Message message) {
        this.to = to;
        this.message = message;
    }
}
