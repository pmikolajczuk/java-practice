package pl.mikolaj.javapractice.y2026.m07.sort;

import org.junit.jupiter.api.Test;
import pl.mikolaj.javapractice.sort.SortTestUtils;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        assertTrue(SortTestUtils.sortTestSilent(new QuickSort()::sort));
    }
}