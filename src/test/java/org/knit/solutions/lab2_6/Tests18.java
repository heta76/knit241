package org.knit.solutions.lab2_6;

// SolutionTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tests {
    private final Solution18 sol = new Solution18();

    @Test
    void testTypicalWithZeros() {
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        sol.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4}, arr);
    }

    @Test
    void testTypicalWithoutZeros() {
        int[] arr = {1, 2, 3};
        sol.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        sol.duplicateZeros(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testAllZeros() {
        int[] arr = {0, 0, 0};
        sol.duplicateZeros(arr);
        // В итоге тоже [0,0,0], потому что всякий выход за границы обрезается
        assertArrayEquals(new int[]{0, 0, 0}, arr);
    }

    @Test
    void testZeroAtBeginning() {
        int[] arr = {0, 1, 2, 3};
        sol.duplicateZeros(arr);
        assertArrayEquals(new int[]{0, 0, 1, 2}, arr);
    }

    @Test
    void testZeroAtEnd() {
        int[] arr = {1, 2, 3, 0};
        sol.duplicateZeros(arr);
        assertArrayEquals(new int[]{1, 2, 3, 0}, arr);
    }

    @Test
    void testPerformanceLargeArray() {
        int size = 10_000;
        int[] arr = new int[size];
        // заполнить случайными числами 0–9
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        long start = System.nanoTime();
        sol.duplicateZeros(arr);
        long durationMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("duplicateZeros on " + size + " elems took " + durationMs + " ms");
        // Проверяем, что уложились в 200 ms (если тесты будут на CI со средней машиной)
        assertTrue(durationMs < 200, "Performance regression: took " + durationMs + " ms");
    }
}

