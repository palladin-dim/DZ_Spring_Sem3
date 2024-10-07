package com.example.dz_spring_sem3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dz_spring_sem3.domain.User;

@Service
public class RegistrationService {
    @Autowired
    private UserService userService;
    @Autowired
    private DataProcessingService dataProcessingService;
    @Autowired
    private NotificationService notificationService;

    public void registrationUser(User user){
        userService.createUser(user.getName(), user.getAge(), user.getEmail());
        dataProcessingService.addUserToList(user);
        notificationService.notifyUser(user);
    }

    public DataProcessingService getDataProcessingService() {
        return dataProcessingService;
    }
}
