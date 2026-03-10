package com.NinJ.WorkMitra.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class WorkerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String skills;
    @Column(nullable = false)
    private boolean availability;

    private double rating;
    private double experience;

    private double latitude;
    private double longitude;
    private LocalDateTime lastLocationUpdate;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;
}
