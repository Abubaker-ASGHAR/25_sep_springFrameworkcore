package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class PaymentService {

    private final NotificationService notificationService;


    @Autowired
    public PaymentService(NotificationService notificationService) {
        this.notificationService = notificationService;

    }


    public void processPayment(){
        System.out.println("Processing payment");
        notificationService.SendNotification(" payment processed successfully");
    }

}


