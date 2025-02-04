package org.example.web;

public class DoneState implements TaskState {
    @Override
    public void plan(Task task) {
        System.out.println("Task-ul este deja finalizat și nu poate fi planificat din nou.");
    }

    @Override
    public void start(Task task) {
        System.out.println("Task-ul este deja finalizat și nu poate reveni la 'In Progress'.");
    }

    @Override
    public void review(Task task) {
        System.out.println("Task-ul este deja finalizat și nu poate fi trecut din nou prin review.");
    }

    @Override
    public void complete(Task task) {
        System.out.println("Task-ul este deja finalizat.");
    }
}

