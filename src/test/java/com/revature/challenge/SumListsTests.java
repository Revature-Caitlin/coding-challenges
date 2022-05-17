package com.revature.challenge;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.LinkedList;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SumListsTests {

    @Test
    @Order(1)
    void test_case_one_reverseOrder() {
        LinkedList<Integer> A = new LinkedList<>(Arrays.asList(7, 1, 6));
        LinkedList<Integer> B = new LinkedList<>(Arrays.asList(5, 9, 2));

        long expected = 912;
        long actual = SumLists.getSum(A, B);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Order(2)
    void test_case_two_reverseOrder() {
        LinkedList<Integer> A = new LinkedList<>(Arrays.asList(6, 9, 4, 3, 1));
        LinkedList<Integer> B = new LinkedList<>(Arrays.asList(4, 3, 2));

        long expected = 13730;
        long actual = SumLists.getSum(A, B);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Order(3)
    void test_case_one_forwardOrder() {
        SumLists.setReverse(false);

        LinkedList<Integer> A = new LinkedList<>(Arrays.asList(6, 1, 7));
        LinkedList<Integer> B = new LinkedList<>(Arrays.asList(2, 9, 5));

        long expected = 912;
        long actual = SumLists.getSum(A, B);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @Order(4)
    void test_case_two_forwardOrder() {
        LinkedList<Integer> A = new LinkedList<>(Arrays.asList(1, 3, 4, 9, 6));
        LinkedList<Integer> B = new LinkedList<>(Arrays.asList(2, 3, 4));

        long expected = 13730;
        long actual = SumLists.getSum(A, B);

        assertThat(actual).isEqualTo(expected);
    }


}
