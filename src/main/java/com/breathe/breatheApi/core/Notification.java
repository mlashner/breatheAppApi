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
public class Notification extends Base{
    @Column(name = "msg")
    private String msg;

    @Column(name = "user_id", nullable = false)
    private long user_id;

    @Builder.Default
    @Column(name = "workshop_id", nullable = true)
    private Long workshop_id = null;
}
