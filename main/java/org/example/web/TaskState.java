package org.example.web;

public interface TaskState {
    void plan(Task task);
    void start(Task task);
    void review(Task task);
    void complete(Task task);
}
