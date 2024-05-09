package com.breathe.breatheApi.core;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "notifications")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "msg")
    private String msg;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "workshop_id")
    private long workshop_id;
}
