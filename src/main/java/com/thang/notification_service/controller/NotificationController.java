package com.thang.notification_service.controller;

import com.thang.notification_service.model.MessageDTO;
import com.thang.notification_service.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {
    @Autowired
    private IEmailService emailService;

    @PostMapping("/sendNotificationEmail.do")
    public void sendNotificationEmail(@RequestBody MessageDTO messageDTO) {
        emailService.sendEmail(messageDTO);
    }
}
