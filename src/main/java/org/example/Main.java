package org.example;

import org.example.service.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.example.config.AppConfig;

public class Main {
    public static void main(String[] args) {
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

       PaymentService paymentService = context.getBean(PaymentService.class);

       paymentService.processPayment();

        ((AnnotationConfigApplicationContext) context).close();

    }
}