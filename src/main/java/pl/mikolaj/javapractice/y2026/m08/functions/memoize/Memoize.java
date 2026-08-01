package pl.mikolaj.javapractice.y2026.m08.functions.memoize;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Memoize {
    public static <T, R> Function<T, R> memoize(Function<T, R> func) {
        Map<T, R> cache = new HashMap<>();
        return (T t) -> cache.computeIfAbsent(t, func);
    }
}
