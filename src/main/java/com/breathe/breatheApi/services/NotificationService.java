package com.breathe.breatheApi.services;

import org.springframework.stereotype.Service;
import com.breathe.breatheApi.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;
}
