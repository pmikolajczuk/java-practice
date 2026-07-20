package pl.mikolaj.javapractice.y2026.m07.recursion.factorial;

public class Factorial {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        System.out.println(factorial1(number));
    }

    public static long factorial1(long n) {
        return n == 0 ? 1 : n * factorial1(n - 1);
    }
}
