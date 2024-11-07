package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public class Card {
    private String name;
    private int age;

    // Метод для считывания атрибутов с консоли
    public void readAttributes() {
        try (Scanner scanner = new Scanner(System.in)) { // Используем try-with-resources
            System.out.print("Введите имя: ");
            this.name = scanner.nextLine();
            System.out.print("Введите возраст: ");
            this.age = scanner.nextInt();
        } // Scanner автоматически закроется здесь
    }

    // Метод для вывода атрибутов на экран
    public void displayAttributes() {
        System.out.println("Имя: " + this.name);
        System.out.println("Возраст: " + this.age);
    }
}
