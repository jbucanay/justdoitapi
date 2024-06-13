package com.gibbs.justDoItApi.controller;

import com.gibbs.justDoItApi.model.Task;
import com.gibbs.justDoItApi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {
    @Autowired
    private TaskService taskService;

    //crud operations
    @GetMapping(path = "tasksxml", produces = {"application/xml"})
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    //adding application json is redundant, just using it for practice
    @GetMapping(path = "tasks", produces = {"application/json"})
    public List<Task> getAllTasksJson(){
        return taskService.getAllTasks();
    }

    @GetMapping("task/{taskId}")
    public Optional<Task> getTask(@PathVariable("taskId") int taskId){
        return taskService.getTask(taskId);
    }

    @GetMapping(value = "task/priority/{priority}")
    public List<Task> getTaskByPriority(@PathVariable("priority") String priority){
        return taskService.getTaskByPriority(priority);
    }
}
