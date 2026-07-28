package pl.mikolaj.javapractice.sort;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Consumer;

public class SortTestUtils {
    private static final int SIZE = 100;
    private static final int BOUND = 100;

    public static boolean sortTest(Consumer<int[]> sort) {
        int[] numbers = generateInput();
        System.out.println("Input: " + Arrays.toString(numbers));
        sort.accept(numbers);
        System.out.println("Output: " + Arrays.toString(numbers));
        return isSorted(numbers);
    }

    private static int[] generateInput() {
        return new Random()
                .ints(SIZE, 0, BOUND)
                .toArray();
    }

    private static boolean isSorted(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i+1] < numbers[i]) {
                return false;
            }
        }
        return true;
    }
}
