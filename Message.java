package com.NinJ.WorkMitra.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.awt.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Message content cannot be empty")
    private String content;
    private TrayIcon.MessageType messagetype;

    private double latitude;
    private double longitude;

    private boolean readStatus;
    private LocalDateTime sentAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
