package org.example.web;

public class ReviewState implements TaskState {
    @Override
    public void plan(Task task) {
        System.out.println("Task-ul nu poate fi planificat din starea 'Review'.");
    }

    @Override
    public void start(Task task) {
        System.out.println("Task-ul nu poate reveni la 'In Progress' din 'Review'.");
    }

    @Override
    public void review(Task task) {
        System.out.println("Task-ul este deja în review.");
    }

    @Override
    public void complete(Task task) {
        System.out.println("Task-ul trece în starea 'Done'.");
        task.setState(new DoneState());
    }
}
