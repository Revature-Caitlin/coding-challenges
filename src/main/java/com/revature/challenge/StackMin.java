package com.revature.challenge;

import java.util.NoSuchElementException;
import java.util.Stack;

public class StackMin {

    private int min;
    private int numOfElements = 0;
    private Stack<Integer> stack;
    private Stack<Integer> minList;


    public StackMin() {
        this.stack = new Stack<>();
        this.minList = new Stack<>();
    }


    public void push(Integer num) {
        if(isEmpty()) {
            minList.push(num);
            min = num;
        } else {
            if(num <= min)  {
                min = num;
                minList.push(min);
            }
        }
        stack.push(num);
        numOfElements++;
    }

    public int pop() {
        if(isEmpty())  {
            throw new NoSuchElementException("Stack is currently empty. Unable to access null value.");
        } else {
            int fifo = stack.pop();

            if(fifo == min) {
                minList.pop();
                min = minList.peek();
            }
            numOfElements--;
            return fifo;
        }
    }

    public int getMin() {
        if(isEmpty()) {
            throw new NoSuchElementException("Stack is currently empty. Unable to access null value.");
        } else {
            return min;
        }
    }

    public boolean isEmpty() {
        return numOfElements == 0;
    }

}
