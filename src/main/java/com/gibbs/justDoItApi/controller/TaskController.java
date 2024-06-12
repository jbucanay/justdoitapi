package com.gibbs.justDoItApi.controller;

import com.gibbs.justDoItApi.model.Task;
import com.gibbs.justDoItApi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping(path = "tasks", produces = {"application/xml"})
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
}
