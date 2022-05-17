package com.revature.challenge;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackMin {

    private int min;
    private int numOfElements = 0;
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minList;


    public StackMin() {
        this.stack = new LinkedList<>();
        this.minList = new LinkedList<>();
    }


    public void push(Integer num) {
        if(isEmpty()) {
            minList.add(num);
            min = num;
        } else {
            if(num < min)  {
                min = num;
                minList.clear();
                minList.add(min);
            } else {
                if(minList.peekLast() == min) {
                    minList.add(num);
                } else if(num < minList.peekLast()) {
                    minList.removeLast();
                    minList.add(num);
                } else {
                    minList.add(num);
                }
            }
        }
        stack.add(num);
        numOfElements++;
    }

    public int pop() {
        if(isEmpty())  {
            throw new NoSuchElementException("Stack is currently empty. Unable to access null value.");
        } else {
            int fifo = stack.removeFirst();

            if(fifo == min && !stack.contains(min)) {
                minList.removeFirst();
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
