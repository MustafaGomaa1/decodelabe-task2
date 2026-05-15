package com.decodelab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n====== AVERAGE CALCULATOR ======\n");
        boolean keepGoing = true;
        while (keepGoing) {
            try {
                System.out.print("How many Subjects do you have :");
                int subjects = Integer.parseInt(sc.next());
                int total = 0;
                for (int i = 0; i < subjects; i++) {
                    System.out.print("\nEnter your " + (i + 1) + " Grade :");
                    int grade = Integer.parseInt(sc.next());
                    if (grade > 100 || grade < 0) {
                        System.out.println("Please Enter Valid Grade!");
                        break;
                    }
                    total += grade;
                }
                double ava = (double) total / subjects;
                System.out.printf("Your Average is %.2f %s\n", ava, determineGrade(ava));
                System.out.println("\nDo you Want To Calculate Another Average : [Y/N]");
                String answer = sc.next();
                if (answer.toUpperCase().charAt(0) == 'Y') {
                    System.out.println("\nThat's Sounds Good Ok Let's Start Again.\n");
                } else {
                    System.out.println("\nOk No Problem See You Next Time :)");
                    keepGoing = false;
                }
            } catch (Exception e) {
                System.out.println("\nInvalid Inputs Value!!\n");
            }
        }
        sc.close();
    }

    public static char determineGrade(double average) {
        if (average >= 90)
            return 'A';
        if (average >= 80)
            return 'B';
        if (average >= 70)
            return 'C';
        if (average >= 60)
            return 'D';
        return 'F';
    }
}