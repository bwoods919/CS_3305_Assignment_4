// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij

import java.util.ArrayList;

public class Stack<E> {

    ArrayList<E> list;
    int size;
    int top = -1;

    public Stack(int size) {

        this.size = size;
        this.list = new ArrayList<E>(size);
    }

    private void push(E push) {

        if (top + 1 == size) {
            System.out.println("Stack is full");
        } else {

            top++;

            if (list.size() > top)
                list.set(top, push);
            else
                list.add(push);
        }
    }

    private void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            top--;
    }

    private E top() {

        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return list.get(top);
    }

    private int size() {
        return size;
    }

    private boolean isEmpty() {
        return size == -1;
    }
}
