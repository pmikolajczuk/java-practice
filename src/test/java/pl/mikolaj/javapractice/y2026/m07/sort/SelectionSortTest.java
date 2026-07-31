package pl.mikolaj.javapractice.y2026.m07.sort;

import org.junit.jupiter.api.Test;
import pl.mikolaj.javapractice.sort.SortTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    private final SelectionSort selectionSort = new SelectionSort();

    @Test
    public void sort() {
        assertTrue(SortTestUtils.sortTest(selectionSort::sort));
    }
}