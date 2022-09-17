// Name: Brendan Woods
// Class: CS 3305/01
// Term: Fall 2022
// Instructor: Dr. Haddad
// Assignment: 4
// IDE Name: Intellij
public class Stack<E> {

    public Node head, tail;
    public int size;

    // method to create a stack
    public void Stack() {
        head = null;
        tail = null;
        size = 0;
    }

    // method push
    public void push(E data) {
        Node temp = new Node(data);
        if (head != null) {
            temp.next = head;
        }
        head = temp;
        size++;
    }

    // method pop
    public E pop() {
        if(isEmpty())
            return null;
        E data = (E) head.data;
        head = head.next;
        size--;
        return data;
    }

    // method top
    public E top() {
        if(isEmpty())
            return null;
        return (E) head.data;
    }

    // method size
    public int size(){
        return size;
    }
    // method isEmpty
    public boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }

// method to print out the list
    public void printList() {
        Node temp;
        temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // class to create nodes as objects
    private class Node<E> {

        private E data;
        private Node next;

        public Node(E data) {
            data = data;
            next = null;
        }
    }
}

