package com.revature.challenge;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class StackMinTests {

    StackMin stack = new StackMin();

    @BeforeAll
    void init() {
        stack.push(8);
        stack.push(9);
        stack.push(6);
        stack.push(5);
        stack.push(1);
        stack.push(3);
        stack.push(2);
    }

    @Test
    @Order(1)
    void test_case_one_positive() {
        int expected = 1;

        long startTime = System.currentTimeMillis();
        int actual = stack.getMin();
        long endTime = System.currentTimeMillis();

        assertThat(actual).isEqualTo(expected);

        System.out.println("Program Run Time: " + (endTime - startTime));
    }

    @Test
    @Order(2)
    void test_case_two_positive() {
        stack.pop();
        stack.pop();

        int expected = 1;
        long startTime = System.currentTimeMillis();
        int actual = stack.getMin();
        long endTime = System.currentTimeMillis();

        assertThat(actual).isEqualTo(expected);

        System.out.println("Program Run Time: " + (endTime - startTime));
    }

    @Test
    @Order(3)
    void test_case_three_positive() {
        stack.pop();
        stack.pop();
        stack.pop();

        int expected = 2;
        long startTime = System.currentTimeMillis();
        int actual = stack.getMin();
        long endTime = System.currentTimeMillis();

        assertThat(actual).isEqualTo(expected);

        System.out.println("Program Run Time: " + (endTime - startTime));
    }

    @Test
    @Order(4)
    void test_case_four_positive() {

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        int expected = 3;
        long startTime = System.currentTimeMillis();
        int actual = stack.getMin();
        long endTime = System.currentTimeMillis();

        assertThat(actual).isEqualTo(expected);

        System.out.println("Program Run Time: " + (endTime - startTime));

    }
}
