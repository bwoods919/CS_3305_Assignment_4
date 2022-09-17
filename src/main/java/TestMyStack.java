// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij

import java.util.Scanner;

// Main method for the test program
public class TestMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stack<Integer> integerStack = new Stack<>();
        int option;
        int data;

        // Sentient Loop
        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1 -> { // Push element
                    System.out.print("\nEnter the number to push: ");
                    data = input.nextInt();
                    System.out.println("Pushing value " + data + " to the Stack");
                    System.out.print("Stack content before pushing " + data + " is: ");
                    integerStack.printList();
                    integerStack.push(data);
                    System.out.print("\nStack content after pushing " + data + " is: ");
                    integerStack.printList();
                    System.out.println("\n");
                }
                case 2 -> { // Pop element
                    System.out.println("\nPopping the top element from the Stack.");
                    System.out.print("Stack content before popping from the stack is: ");
                    integerStack.printList();
                    integerStack.pop();
                    System.out.print("\nStack content after popping from the stack is: ");
                    integerStack.printList();
                    System.out.println("\n");
                }
                case 3 -> // Top Element
                        System.out.println("\nThe top element of the stack is: " + integerStack.top() + "\n");
                case 4 -> { // Size
                    System.out.println("\nThe elements of the Stack are: ");
                    printMenu();
                    System.out.println("\nThe size of the Stack is " + integerStack.size + "\n");
                }
                case 5 -> { // Is empty
                    System.out.println("\nThe elements of the Stack are: ");
                    printMenu();
                    if (integerStack.isEmpty())
                        System.out.println("\nThe Stack is Empty!\n");
                    else
                        System.out.println("\nThe Stack is Not Empty!\n");
                }
                case 6 -> { // Print Stack Content
                    System.out.print("\nThe elements of the stack are: ");
                    integerStack.printList();
                    System.out.println("\n");
                }
                case 7 -> // Exit
                        System.exit(-1);
            }
        }
    }

    // Print the menu
    private static void printMenu() {
        System.out.println("\n--------MAIN MENU-------");
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
