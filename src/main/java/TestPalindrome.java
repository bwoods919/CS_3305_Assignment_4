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

        while (true) {

            printMenu();
            option = input.nextInt();

            switch (option) {

                case 1: // Read input string

                    System.out.println( );
                    System.out.print("Enter String: ");
                    input.nextLine();
                    inputStr = input.nextLine();
                    break;
                case 2: // Check if palindrome

                    System.out.println();
                    System.out.println("Entered String:\t" + inputStr);
                    boolean palindrome = checkPalindrome();

                    if (palindrome)
                        System.out.println("Judgment:\t\tPalindrome");
                    else
                        System.out.println("Judgment:\t\tNot Palindrome");

                    break;
                case 3: // Exit program
                    System.exit(-1);
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("---------------MAIN MENU--------------");
        System.out.println("1 - Read input string");
        System.out.println("2 - Check if palindrome");
        System.out.println("3 - Exit program");
        System.out.println();
        System.out.print("Enter option number: ");
    }

    private static boolean checkPalindrome() {
        return true;
    }
}
