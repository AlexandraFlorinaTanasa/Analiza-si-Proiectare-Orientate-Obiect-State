package org.example.web;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Task task = new Task("Implementare feature Z");

        System.out.println("Stare inițială: " + task.getStateName());
        task.plan(); // Trecere la "Planned"
        System.out.println("Stare curentă: " + task.getStateName());

        task.start(); // Trecere la "In Progress"
        System.out.println("Stare curentă: " + task.getStateName());

        task.review(); // Trecere la "Review"
        System.out.println("Stare curentă: " + task.getStateName());

        task.complete(); // Trecere la "Done"
        System.out.println("Stare curentă: " + task.getStateName());
    }
}

