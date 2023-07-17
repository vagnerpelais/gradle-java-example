package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class AnimalSounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("====== Animal Sounds ======");
            System.out.println("1. Cow");
            System.out.println("2. Dog");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            int option = scanner.nextInt();


            switch (option) {
                case 1 -> {
                    printCow();
                    break;
                }
                case 2 -> {
                    printDog();
                    break;
                }
                case 3 -> {
                    exit = true;
                    System.out.println("Exiting...");
                }
                default -> {
                    System.out.println("Invalid choice! Please select again");
                }
            }
        }

    }

    public static void printCow() {
        System.out.println("Here's a cow:");
        System.out.println("        (__)");
        System.out.println("        (oo)");
        System.out.println(" /------\\/ ");
        System.out.println("/ |    ||  ");
        System.out.println("*  /\\---/\\ ");
        System.out.println("   ~~   ~~ ");
    }

    public static void printDog() {
        System.out.println("Here's a dog:");
        System.out.println(" / \\_____/ \\");
        System.out.println("|  0   0  |");
        System.out.println(" (   V   )");
        System.out.println("  /     \\");
        System.out.println(" /_/ | \\_\\");
        System.out.println("    \\_|_/ ");
    }
}