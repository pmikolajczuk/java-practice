package pl.mikolaj.javapractice.y2026.m07.sort;

import java.util.Arrays;

public class MergeSort {
    public void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] numbers, int beginningIdx, int endIdx) {
        if (beginningIdx == endIdx) {
            return;
        }

        //split
        int middleIdx = (endIdx + beginningIdx) / 2;
        sort(numbers, beginningIdx, middleIdx);
        sort(numbers, middleIdx + 1, endIdx);

        //merge
        int[] first = Arrays.copyOfRange(numbers, beginningIdx, middleIdx + 1);
        int[] second = Arrays.copyOfRange(numbers, middleIdx + 1, endIdx + 1);

        int i = 0;
        int j = 0;
        int k = beginningIdx;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                numbers[k++] = first[i++];
            } else {
                numbers[k++] = second[j++];
            }
        }

        while (i < first.length) {
            numbers[k++] = first[i++];
        }

        while(j < second.length) {
            numbers[k++] = second[j++];
        }
    }
}
