package pl.mikolaj.javapractice.y2026.m07.recursion.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private Fibonacci fibonacci;

    @Test
    void fibonacciFast_shouldHandleVariousCases() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        assertEquals(0, fibonacci.fibonacciFast(1));
        assertEquals(1, fibonacci.fibonacciFast(2));
        assertEquals(1, fibonacci.fibonacciFast(3));
        assertEquals(2, fibonacci.fibonacciFast(4));
        assertEquals(3, fibonacci.fibonacciFast(5));
        assertEquals(34, fibonacci.fibonacciFast(10));
        assertEquals(5702887, fibonacci.fibonacciFast(35));
    }

    @Test
    void fibonacciFast_performanceTest() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        long startTime = System.nanoTime();
        fibonacci.fibonacciFast(1000); // Test with a larger input to see the performance
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Execution time for fibonacciFast(1000): " + elapsedTime + " nanoseconds");
    }

    @Test
    void fibonacciMemoized_shouldHandleVariousCases() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        assertEquals(0, fibonacci.fibonacciMemoized(1));
        assertEquals(1, fibonacci.fibonacciMemoized(2));
        assertEquals(1, fibonacci.fibonacciMemoized(3));
        assertEquals(2, fibonacci.fibonacciMemoized(4));
        assertEquals(3, fibonacci.fibonacciMemoized(5));
        assertEquals(34, fibonacci.fibonacciMemoized(10));
        assertEquals(5702887, fibonacci.fibonacciMemoized(35));
    }

    @Test
    void fibonacciMemoized_performanceTest() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        long startTime = System.nanoTime();
        fibonacci.fibonacciMemoized(45);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Execution time for fibonacciMemoized(45): " + elapsedTime + " nanoseconds");
    }

    @Test
    void fibonacciCache_shouldHandleVariousCases() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        assertEquals(0, fibonacci.fibonacciCache(1));
        assertEquals(1, fibonacci.fibonacciCache(2));
        assertEquals(1, fibonacci.fibonacciCache(3));
        assertEquals(2, fibonacci.fibonacciCache(4));
        assertEquals(3, fibonacci.fibonacciCache(5));
        assertEquals(34, fibonacci.fibonacciCache(10));
        assertEquals(5702887, fibonacci.fibonacciCache(35));
    }

    @Test
    void fibonacciCache_performanceTest() {
        fibonacci = new Fibonacci(); // Create a new instance to ensure a fresh cache
        long startTime = System.nanoTime();
        fibonacci.fibonacciCache(1000);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Execution time for fibonacciCache(1000): " + elapsedTime + " nanoseconds");
    }

    @Test
    void fibonacci1_shouldHandleVariousCases() {
        assertEquals(0, Fibonacci.fibonacci1(1));
        assertEquals(1, Fibonacci.fibonacci1(2));
        assertEquals(1, Fibonacci.fibonacci1(3));
        assertEquals(2, Fibonacci.fibonacci1(4));
        assertEquals(3, Fibonacci.fibonacci1(5));
        assertEquals(34, Fibonacci.fibonacci1(10));
        assertEquals(5702887, Fibonacci.fibonacci1(35));
    }

    @Test
    void fibonacci1_performanceTest() {
        long startTime = System.nanoTime();
        Fibonacci.fibonacci1(45);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Execution time for fibonacci1(45): " + elapsedTime + " nanoseconds");
    }
}

