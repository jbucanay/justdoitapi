package com.gibbs.justDoItApi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
@Entity
public class Task {
    @Id
    private int task_id;
    private Timestamp completed_at;
    private Timestamp delete_at;
    private String category;
    private LocalDateTime deadline;
    private String priority;
    private String description;
    private String title;

    public int getTask_id() {
        return task_id;
    }

    public Timestamp getCompleted_at() {
        return completed_at;
    }

    public Timestamp getDelete_at() {
        return delete_at;
    }

    public String getCategory() {
        return category;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public String getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

//    @Override
//    public String toString() {
//        return "Task{" +
//                "task_id=" + task_id +
//                ", completed_at=" + completed_at +
//                ", delete_at=" + delete_at +
//                ", category='" + category + '\'' +
//                ", deadline=" + deadline +
//                ", priority='" + priority + '\'' +
//                ", description='" + description + '\'' +
//                ", title='" + title + '\'' +
//                '}';
//    }
}
