package com.gibbs.justDoItApi.model;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class Task {
    private int task_id;
    private Timestamp completed_at;
    private Timestamp delete_at;
    private String category;
    private LocalDateTime deadline;
    private String priority;
    private String description;
    private String title;
}
