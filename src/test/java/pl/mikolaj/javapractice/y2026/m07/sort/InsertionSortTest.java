package pl.mikolaj.javapractice.y2026.m07.sort;

import org.junit.jupiter.api.Test;
import pl.mikolaj.javapractice.sort.SortTestUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;


class InsertionSortTest {

    @Test
    public void sort() {
        assertTrue(SortTestUtils.sortTest(new InsertionSort()::sort));
    }
}
