package com.gibbs.justDoItApi.service;

import com.gibbs.justDoItApi.model.Task;
import com.gibbs.justDoItApi.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public void addTask(Task task){
        taskRepo.save(task);
    }

    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }

    public Optional<Task> getTask(int taskId){
        return taskRepo.findById(taskId);
    }
}
