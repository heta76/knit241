package org.knit.solutions.lab2_6;
// SolutionTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Tests19 {
    private final Solution19 sol = new Solution19();

    @Test
    void testExample1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }

    @Test
    void testExample2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testExample3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void testEmptyBoth() {
        int[] nums1 = {};
        sol.merge(nums1, 0, new int[]{}, 0);
        assertArrayEquals(new int[]{}, nums1);
    }

    @Test
    void testAllFromFirst() {
        int[] nums1 = {1, 2, 3, 0, 0};
        int m = 3;
        int[] nums2 = {};
        int n = 0;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1,2,3,0,0}, nums1);
    }

    @Test
    void testAllFromSecond() {
        int[] nums1 = {0,0,0};
        int m = 0;
        int[] nums2 = {4,5,6};
        int n = 3;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{4,5,6}, nums1);
    }

    @Test
    void testNegativesAndDuplicates() {
        int[] nums1 = {-3,-1,0,0,0,0};
        int m = 2; // значимые: -3, -1
        int[] nums2 = {-2,-2,-1,5};
        int n = 4;
        sol.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{-3,-2,-2,-1,-1,5}, nums1);
    }

    @Test
    void testPerformanceLargeArrays() {
        int m = 100_000, n = 100_000;
        int[] nums1 = new int[m + n];
        int[] nums2 = new int[n];
        // генерируем отсортированные последовательности
        for (int i = 0; i < m; i++) {
            nums1[i] = i * 2;
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = i * 2 + 1;
        }
        long start = System.nanoTime();
        sol.merge(nums1, m, nums2, n);
        long durationMs = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Merge of " + (m+n) + " elems took " + durationMs + " ms");
        assertTrue(durationMs < 200, "Performance regression: took " + durationMs + " ms");
        // Проверяем пару ключевых мест
        assertEquals(0, nums1[0]);
        assertEquals(1, nums1[1]);
        assertEquals(199_998, nums1[m + n - 2]);
        assertEquals(199_999, nums1[m + n - 1]);

    }
}

