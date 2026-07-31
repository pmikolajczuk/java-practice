package pl.mikolaj.javapractice.y2026.m07.sort;

import pl.mikolaj.javapractice.sort.SortUtils;

public class SelectionSort {

    public void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int smallestIdx = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[smallestIdx]) {
                    smallestIdx = j;
                }
            }
            SortUtils.swap(numbers, i, smallestIdx);
        }
    }
}
