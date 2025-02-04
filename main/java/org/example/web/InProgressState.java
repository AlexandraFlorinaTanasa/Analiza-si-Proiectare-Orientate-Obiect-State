package org.example.web;

public class InProgressState implements TaskState {
    @Override
    public void plan(Task task) {
        System.out.println("Task-ul nu poate fi planificat din starea 'In Progress'.");
    }

    @Override
    public void start(Task task) {
        System.out.println("Task-ul este deja în progres.");
    }

    @Override
    public void review(Task task) {
        System.out.println("Task-ul trece în starea 'Review'.");
        task.setState(new ReviewState());
    }

    @Override
    public void complete(Task task) {
        System.out.println("Task-ul trebuie să treacă prin review înainte de a fi finalizat.");
    }
}
