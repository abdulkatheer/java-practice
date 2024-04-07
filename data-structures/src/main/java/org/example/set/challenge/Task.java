package org.example.set.challenge;

import java.util.Objects;

public class Task implements Comparable<Task> {
    private String assignee;
    private String project;
    private String description;
    private Status status;
    private Priority priority;

    public Task(String assignee, String project, String description, Status status, Priority priority) {
        this.assignee = assignee;
        this.project = project;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public Task(String assignee, String project, String description, Priority priority) {
        this(assignee, project, description, assignee == null ? Status.IN_PROGRESS : Status.NOT_YET_ASSIGNED, priority);
    }

    public Task(String project, String description, Priority priority) {
        this(null, project, description, priority);
    }

    public String getAssignee() {
        return assignee;
    }

    public String getProject() {
        return project;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(project, task.project) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public int compareTo(Task o) {
        int r1 = this.project.compareTo(o.project);
        return r1 == 0 ? this.description.compareTo(o.description) : r1;
    }

    @Override
    public String toString() {
        return "%-20s %-25s %-10s %-10s %s".formatted(priority, description, priority, assignee, status);
    }
}

enum Status {
    NOT_YET_ASSIGNED,
    ASSIGNED,
    IN_PROGRESS
}

enum Priority {
    LOW,
    MEDIUM,
    HIGH
}


