package com.task4.quesFive;

import java.util.EmptyStackException;

public class StackDS {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public StackDS() {
        this(DEFAULT_CAPACITY);
    }

    public StackDS(int capacity) {
        stackArray = new int[capacity];
        top = -1;
    }

    // Method to push elements onto the stack
    public void push(int element) {
        if (top == stackArray.length - 1) {
            // Stack is full, need to resize
            resizeStack();
        }
        stackArray[++top] = element;
        System.out.println("Pushed element: " + element);
    }

    // Method to pop elements from the stack
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Helper method to resize the stack when it's full
    private void resizeStack() {
        int newCapacity = stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    public static void main(String[] args) {
        StackDS stack = new StackDS();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping elements from the stack
        stack.pop();
        stack.pop();
        stack.pop();

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
