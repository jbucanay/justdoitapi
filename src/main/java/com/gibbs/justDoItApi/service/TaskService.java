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

    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }

    public Optional<Task> getTask(int taskId){
        return taskRepo.findById(taskId);
    }

    public List<Task> getTaskByPriority(String priority){
        return taskRepo.findByPriorityContainingIgnoreCase(priority);
    }

    public Task getTaskByIdAndPriority(int taskId, String priority){
        return taskRepo.findByTaskIdAndPriorityContainsIgnoreCase(taskId,priority);
    }

    public Optional<Task> addTask(Task task){
        Task saved = taskRepo.save(task);
        return this.getTask(saved.getTaskId());
    }

    public Optional<Task> updateTask(Task task){
        return null;
    }
}
