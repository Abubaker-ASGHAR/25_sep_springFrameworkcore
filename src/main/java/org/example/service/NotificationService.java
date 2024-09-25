package org.example.service;

import org.springframework.stereotype.Component;


@Component
public class NotificationService {

    public void SendNotification(String message) {

        System.out.println("Notification"+message);

    }

}
