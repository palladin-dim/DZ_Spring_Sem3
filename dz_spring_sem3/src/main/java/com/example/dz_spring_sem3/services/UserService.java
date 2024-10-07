package com.example.dz_spring_sem3.services;

import org.springframework.stereotype.Service;
import com.example.dz_spring_sem3.domain.User;

@Service
public class UserService {

    public User createUser(String name, int age, String email){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        return user;
    }


}
