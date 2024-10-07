package com.example.dz_spring_sem3.services;

import org.springframework.stereotype.Service;
import com.example.dz_spring_sem3.domain.User;


@Service
public class NotificationService {
    public void notifyUser(User user){
        System.out.println("A new user has been created: " + user.getName());
    }
}
