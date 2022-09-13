// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij

import java.util.Scanner;

public class TestPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int option;
        String inputStr = "";

        // Sentient Loop
        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {
                case 1 -> { // Read input string
                    System.out.print("\nEnter String: ");
                    input.nextLine();
                    inputStr = input.nextLine();
                }
                case 2 -> { // Check if palindrome
                    System.out.println("\nEntered String:\t" + inputStr);
                    inputStr = inputStr.toLowerCase();
                    boolean palindrome = inputStr.equals(reverseString(inputStr));
                    if (palindrome)
                        System.out.println("Judgment:\t\tPalindrome");
                    else
                        System.out.println("Judgment:\t\tNot Palindrome");
                }
                case 3 -> // Exit program
                        System.exit(-1);
            }
        }
    }

    // Method to reverse the string
    private static void printMenu() {
        System.out.println("\n---------------MAIN MENU--------------");
        System.out.println("1 - Read input string");
        System.out.println("2 - Check if palindrome");
        System.out.println("3 - Exit program");
        System.out.print("\nEnter option number: ");
    }

    public static String reverseString(String str)
    {
        char[] reverseString = new char[str.length()];

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        int i = 0;
        while (!stack.isEmpty()) { // popping element until
            reverseString[i++] = stack.pop();
        }

        return new String(reverseString);
    }
}
