package com.gibbs.justDoItApi.repo;

import com.gibbs.justDoItApi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {
    List<Task> findByPriorityContainingIgnoreCase(String priority);
    Task findByTaskIdAndPriorityContainsIgnoreCase(int taskId, String priority);
}
