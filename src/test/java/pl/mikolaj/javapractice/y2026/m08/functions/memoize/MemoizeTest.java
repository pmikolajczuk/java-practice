package pl.mikolaj.javapractice.y2026.m08.functions.memoize;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class MemoizeTest {

    @Test
    void memoizeShouldReturnCachedResultForSameInput() {
        AtomicInteger counter = new AtomicInteger(0);
        Function<Integer, Integer> increment = Memoize.memoize(x -> {
            counter.incrementAndGet();
            return x + 1;
        });

        assertEquals(2, increment.apply(1));
        assertEquals(2, increment.apply(1));
        assertEquals(1, counter.get());
    }

    @Test
    void memoizeShouldComputeResultForDifferentInputs() {
        AtomicInteger counter = new AtomicInteger(0);
        Function<Integer, Integer> increment = Memoize.memoize(x -> {
            counter.incrementAndGet();
            return x + 1;
        });

        assertEquals(2, increment.apply(1));
        assertEquals(3, increment.apply(2));
        assertEquals(2, counter.get());
    }

    @Test
    void memoizeShouldHandleNullInput() {
        Function<String, String> identity = Memoize.memoize(x -> x);

        assertNull(identity.apply(null));
    }

    @Test
    void memoizeShouldHandleNullOutput() {
        Function<Integer, String> toNull = Memoize.memoize(x -> null);

        assertNull(toNull.apply(1));
        assertNull(toNull.apply(1));
    }
}
