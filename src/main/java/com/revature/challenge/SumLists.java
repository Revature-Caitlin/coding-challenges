package com.revature.challenge;

/*
*   Problem:
*       You are given two numbers stored in a linked list, with each node containing a single digit.
*       The numbers are stored in reverse order.
*       Return the sum of the two numbers.
*           i.e.) 7-> 1-> 6 + 5-> 9-> 2
*                   617 + 295
*                   912
*       Follow Up:
*           What if the numbers were stored in forward order?
*
* */

import java.util.LinkedList;

public class SumLists {

    private static boolean reverse = true;

    public static long getSum(LinkedList<Integer> A, LinkedList<Integer> B) {
        long firstNum = getNumber(A);
        long secondNum = getNumber(B);
        return firstNum + secondNum;
    }

    private static long getNumber(LinkedList<Integer> A) {
        long num = 0;
        int tensPlace = 1;

        while(!A.isEmpty()) {
            if(reverse) {
                num += (tensPlace * A.removeFirst());
            } else {
                num += (tensPlace * A.removeLast());
            }
            tensPlace *= 10;
        }
        return num;
    }

    public static void setReverse(boolean bool) {
        reverse = bool;
    }

}
