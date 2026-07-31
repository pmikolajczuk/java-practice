package pl.mikolaj.javapractice.y2026.m07.sort;

public class InsertionSort {

    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int tmp = numbers[i];
            int j = i - 1;
            while(j >= 0 && tmp < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = tmp;
        }
    }
}
