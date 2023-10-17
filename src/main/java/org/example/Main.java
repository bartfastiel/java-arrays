package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] grades = new int[5];
        grades[3] = 6;
        grades[4] = 3;

        for (int grade : grades) {
            System.out.println("Eine Schulnote: "+grade);
        }

        System.out.println("Ende");
    }
}