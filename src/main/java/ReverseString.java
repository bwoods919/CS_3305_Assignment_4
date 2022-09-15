// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        String inputStr = "";

        // Sentient Loop
        while (true) {
            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1 -> { // Read input
                    System.out.print("\nEnter String: ");
                    input.nextLine();
                    inputStr = input.nextLine();
                }
                case 2 -> // Print Reverse
                        reverseString(inputStr);
                case 3 -> // Exit
                        System.exit(-1);
            }
        }
    }

    // Method to print the menu
    public static void printMenu() {
        System.out.println("\n---------------MAIN MENU--------------");
        System.out.println("1 - Read input string");
        System.out.println("2 - Reverse and display input string");
        System.out.println("3 - Exit program");
        System.out.print("\nEnter option number: ");
    }

    // Method to reverse the string
    public static void reverseString(String inputStr) {

        Stack<String> stack = new Stack();

        String[] words = inputStr.split(" ");

        for(String word: words)
            stack.push(word);

        System.out.println("\nEntered string:\t\t" + inputStr);
        System.out.print("Reversed String:\t\t");
        stack.printList();
        System.out.println();
    }
}
