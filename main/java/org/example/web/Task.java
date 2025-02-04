package org.example.web;

public class Task {
    private TaskState currentState;

    public Task(String name) {
        this.currentState = new ToDoState(); // Starea inițială
    }

    public void setState(TaskState state) {
        this.currentState = state;
    }

    public void plan() {
        currentState.plan(this);
    }

    public void start() {
        currentState.start(this);
    }

    public void review() {
        currentState.review(this);
    }

    public void complete() {
        currentState.complete(this);
    }

    public String getStateName() {
        return currentState.getClass().getSimpleName();
    }
}

