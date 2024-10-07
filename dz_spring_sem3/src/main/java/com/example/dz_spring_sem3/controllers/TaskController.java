package com.example.dz_spring_sem3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dz_spring_sem3.domain.User;
import com.example.dz_spring_sem3.services.DataProcessingService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private DataProcessingService service;

    @GetMapping
    private List<String> getAllTasks(){
        List<String> tasks = new ArrayList<>();
        tasks.add("sort");
        tasks.add("filter-age");
        tasks.add("calc");
        return tasks;
    }

    @GetMapping("/sort") //localhost:8080/tasks/sort
    public List<User> sortUsersByAge(){
        return service.sortUserByAge(service.getRepository().getUsers());
    }
    @GetMapping("/filter-{age}") //localhost:8080/tasks/sort
    public List<User> filterUsersByAge(@PathVariable("id") int age){
        return service.filterUsersByAge(service.getRepository().getUsers(), age);
    }
    @GetMapping("/calc") //localhost:8080/tasks/sort
    public double calculateAverageAge() {
        return service.calculateAverageAge(service.getRepository().getUsers());
    }
}
