// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij

import java.util.Scanner;

public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int option;

        // Sentient Loop
        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1: // Push element
                    break;
                case 2: // Pop element
                    break;
                case 3: // Top Element
                    break;
                case 4: // Size
                    break;
                case 5: // Is empty
                    break;
                case 6: // Print Stack Content
                    break;
                case 7: // Exit
                    System.exit(-1);
                    break;
            }
        }
    }

    // Print the menu
    private static void printMenu() {
        System.out.println();
        System.out.println("--------MAIN MENU-------");
        System.out.println("1 – Push element");
        System.out.println("2 – Pop element");
        System.out.println("3 – Top element");
        System.out.println("4 – Size of stack");
        System.out.println("5 – Is Empty stack?");
        System.out.println("6 - Print stack content");
        System.out.println("7 - Exit program");
        System.out.println();
        System.out.print("Enter option number: ");
    }
}
