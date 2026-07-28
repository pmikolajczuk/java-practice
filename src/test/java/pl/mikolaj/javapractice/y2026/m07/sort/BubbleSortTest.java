package pl.mikolaj.javapractice.y2026.m07.sort;

import org.junit.jupiter.api.Test;
import pl.mikolaj.javapractice.sort.SortTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    void sort() {
        assertTrue(SortTestUtils.sortTest(bubbleSort::sort));
    }
}