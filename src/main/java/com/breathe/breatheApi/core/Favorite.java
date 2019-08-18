package com.breathe.breatheApi.core;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "favorites")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorite extends Base {
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "workshop_id")
    private Workshop workshop;
}