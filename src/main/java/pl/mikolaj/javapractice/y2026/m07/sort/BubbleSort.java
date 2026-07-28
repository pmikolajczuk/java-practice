package pl.mikolaj.javapractice.y2026.m07.sort;

import pl.mikolaj.javapractice.sort.SortUtils;

public class BubbleSort {

    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    SortUtils.swap(numbers, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
