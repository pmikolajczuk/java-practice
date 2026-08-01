package pl.mikolaj.javapractice.sort;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SortTestUtils {
    private static final int SIZE = 1_000;
    private static final int BOUND = 1_000;

    public static boolean sortTest(Consumer<int[]> sort) {
        int[] numbers = generateInput();
        System.out.println("Input: " + Arrays.toString(numbers));

        Map<Integer, Long> inputCounts = createCountsMap(numbers);
        System.out.println("InputCounts: " + inputCounts);

        sort.accept(numbers);
        System.out.println("Output: " + Arrays.toString(numbers));

        Map<Integer, Long> outputCounts = createCountsMap(numbers);
        System.out.println("OutputCounts: " + outputCounts);

        return hasSameValues(inputCounts, outputCounts) && isSorted(numbers);
    }

    public static boolean sortTestSilent(Consumer<int[]> sort) {
        int[] numbers = generateInput();
        Map<Integer, Long> inputCounts = createCountsMap(numbers);
        sort.accept(numbers);
        Map<Integer, Long> outputCounts = createCountsMap(numbers);
        return hasSameValues(inputCounts, outputCounts) && isSorted(numbers);
    }


    private static int[] generateInput() {
        return new Random()
                .ints(SIZE, 0, BOUND)
                .toArray();
    }

    private static Map<Integer, Long> createCountsMap(int[] numbers) {
        return Arrays
                .stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
    }

    private static boolean hasSameValues(
            Map<Integer, Long> inputCounts,
            Map<Integer, Long> outputCounts
    ) {
        return Objects.equals(inputCounts, outputCounts);
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
