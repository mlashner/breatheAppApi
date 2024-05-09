package com.breathe.breatheApi.repositories;

import com.breathe.breatheApi.core.Notifcation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notifcation, Long> {
    
}
