package pl.mikolaj.javapractice.y2026.m07.recursion.fibonacci;

public class Fibonacci {
    public static long fibonacci1(int n) {
        return switch (n) {
            case 1 -> 0;
            case 2 -> 1;
            default -> fibonacci1(n - 1) + fibonacci1(n - 2);
        };
    }
}
