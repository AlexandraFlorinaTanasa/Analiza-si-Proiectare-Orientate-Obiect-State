package org.example.web;

public class ToDoState implements TaskState {
    @Override
    public void plan(Task task) {
        System.out.println("Task-ul trece în starea 'Planned'.");
        task.setState(new PlannedState());
    }

    @Override
    public void start(Task task) {
        System.out.println("Task-ul trebuie să fie planificat înainte de a începe.");
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

