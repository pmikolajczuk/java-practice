package pl.mikolaj.javapractice.y2026.m07.recursion.fibonacci;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Fibonacci {
    private final Map<Integer, Long> cache = new HashMap<>();

    //create a closure that contains localCache
    private final Function<Integer, Long> memoizeFibonacciFast = memoizeFn(this::fibonacciFast);

    public long fibonacciFast(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;
        return memoizeFibonacciFast.apply(n - 1) + memoizeFibonacciFast.apply(n - 2);
    }

    private <T, R> Function<T, R> memoizeFn(Function<T, R> fn) {
        Map<T, R> localCache = new HashMap<>();
        return t -> {
            R result = localCache.get(t);
            if (result == null) {
                result = fn.apply(t);
                localCache.put(t, result);
            }
            return result;
        };
    }

    public long fibonacciMemoized(int n) {
        return memoizeFn(Fibonacci::fibonacci1).apply(n);
    }

    public long fibonacciCache(int n) {
        Long result = cache.get(n);
        if (result == null) {
            result = switch (n) {
                case 1 -> 0L;
                case 2 -> 1L;
                default -> fibonacciCache(n - 1) + fibonacciCache(n - 2);
            };
            cache.put(n, result);
        }
        return result;
    }

    public static long fibonacci1(int n) {
        return switch (n) {
            case 1 -> 0;
            case 2 -> 1;
            default -> fibonacci1(n - 1) + fibonacci1(n - 2);
        };
    }
}
