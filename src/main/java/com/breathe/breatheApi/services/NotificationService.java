package com.breathe.breatheApi.services;

import com.breathe.breatheApi.core.Notification;
import com.breathe.breatheApi.core.User;

import org.springframework.stereotype.Service;

import com.breathe.breatheApi.repositories.NotificationRepository;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import com.breathe.breatheApi.repositories.UserRepository;
import com.breathe.breatheApi.repositories.WorkshopRepository;

import java.util.List;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private WorkshopRepository workshopRepository;


    public List<Notification> getAllNotifications(){
        return notificationRepository.getAllNotifications();
    }

    public Notification createNotification(Long userId, String message, Long workshopId){
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ObjectNotFoundException(User.class, "User not found for id :: " + userId));

        if (user.getAdmin() == null)
            throw new ObjectNotFoundException(User.class, "User is not authorized to broadcast a notification.");

        workshopRepository.findById(workshopId)
            .orElseThrow(() -> new ObjectNotFoundException(User.class, "Workshop not found for id :: " + workshopId));

        Notification notification = Notification.builder()
                                    .user_id(user.getId())
                                    .msg(message)
                                    .workshop_id(workshopId)
                                    .build();

        System.out.println("ONE!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return notificationRepository.save(notification);
    }

    public Notification createNotification(Long userId, String message){
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new ObjectNotFoundException(User.class, "User not found for id :: " + userId));

        if (user.getAdmin() == null)
            throw new ObjectNotFoundException(User.class, "User is not authorized to broadcast a notification.");

        Notification notification = Notification.builder()
                                    .user_id(user.getId())
                                    .msg(message)
                                    .build();

        System.out.println("TWO!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        return notificationRepository.save(notification);
    }
}
