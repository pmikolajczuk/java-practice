package pl.mikolaj.javapractice.y2026.m07.recursion.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

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
}
