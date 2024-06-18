package com.breathe.breatheApi.controllers;

import com.breathe.breatheApi.core.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.breathe.breatheApi.services.NotificationService;

import javassist.compiler.NoFieldException;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications(){
        return notificationService.getAllNotifications();
    }

    @PostMapping("/broadcast")
    public Notification createNotification(Long userId, String message, Long workshopId){
        System.err.println("WorkshopId: " + workshopId);
        if(workshopId == null){
            return notificationService.createNotification(userId, message);
        }

        return notificationService.createNotification(userId, message, workshopId);
    }
}
