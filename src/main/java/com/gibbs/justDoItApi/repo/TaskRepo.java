package com.gibbs.justDoItApi.repo;

import com.gibbs.justDoItApi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {
}
