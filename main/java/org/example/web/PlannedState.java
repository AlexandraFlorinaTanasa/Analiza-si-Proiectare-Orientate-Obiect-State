package org.example.web;

public class PlannedState implements TaskState {
    @Override
    public void plan(Task task) {
        System.out.println("Task-ul este deja planificat.");
    }

    @Override
    public void start(Task task) {
        System.out.println("Task-ul trece în starea 'In Progress'.");
        task.setState(new InProgressState());
    }

    @Override
    public void review(Task task) {
        System.out.println("Task-ul trebuie să fie în progres înainte de a trece la review.");
    }

    @Override
    public void complete(Task task) {
        System.out.println("Task-ul trebuie să fie în progres înainte de a fi finalizat.");
    }
}
