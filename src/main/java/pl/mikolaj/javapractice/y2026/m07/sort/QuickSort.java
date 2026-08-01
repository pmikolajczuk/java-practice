package pl.mikolaj.javapractice.y2026.m07.sort;

import pl.mikolaj.javapractice.sort.SortUtils;

public class QuickSort {

    public void sort(int[] numbers) {
        sort(numbers, 0, numbers.length - 1);
    }

    private void sort(int[] numbers, int first, int last) {
        if (first >= last) {
            return;
        }

        int pivotIndex = partitionV2(numbers, first, last);

        sort(numbers, first, pivotIndex - 1);
        sort(numbers, pivotIndex + 1, last);
    }

    private int partitionV2(int[] numbers, int first, int last) {
        int pivot = numbers[last];
        int j = first;
        for (int i = first; i < last; i++) {
            if (numbers[i] <= pivot) {
                SortUtils.swap(numbers, i , j);
                j++;
            }
        }
        SortUtils.swap(numbers, j, last);
        return j;
    }

    private int partitionV1(int[] numbers, int first, int last) {
        int pivot = numbers[last];
        int[] sorted = new int[last - first + 1];
        int j = 0;
        int k = sorted.length - 1;

        for (int i = first; i < last; i++) {
            if (numbers[i] <= pivot) {
                sorted[j] = numbers[i];
                j++;
            } else {
                sorted[k] = numbers[i];
                k--;
            }
        }
        assert j == k;
        sorted[j] = pivot;

        System.arraycopy(sorted, 0, numbers, first, sorted.length);
        return first + j;
    }
}
