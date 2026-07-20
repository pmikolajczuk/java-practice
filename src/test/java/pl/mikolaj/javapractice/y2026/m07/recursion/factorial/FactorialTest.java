package pl.mikolaj.javapractice.y2026.m07.recursion.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial1SimpleTest() {
        System.out.println(Factorial.factorial1(3));
        assertEquals(6, Factorial.factorial1(3));
    }    
    @Test
    void factorial1PerformanceTest() {
        long startTime = System.nanoTime();
        long result = Factorial.factorial1(20);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution time for factorial1(20): " + duration + " nanoseconds");
        System.out.println("Result: " + result);
    }
}