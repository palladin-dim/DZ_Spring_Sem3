package com.example.dz_spring_sem3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.dz_spring_sem3.domain.User;
import com.example.dz_spring_sem3.services.RegistrationService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public RegistrationService service;
    @GetMapping
    public List<User> userList() {
        return service.getDataProcessingService().getRepository().getUsers();
    }
    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user){
        service.registrationUser(user);
        return "User added from body!";
    }
}
