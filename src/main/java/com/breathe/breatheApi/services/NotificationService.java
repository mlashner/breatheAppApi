package com.breathe.breatheApi.services;

import com.breathe.breatheApi.core.Notification;
import org.springframework.stereotype.Service;
import com.breathe.breatheApi.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications(){
        return notificationRepository.getAllNotifications();
    }
}
