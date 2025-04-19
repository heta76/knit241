package org.knit.solutions.lab2_6;

public class Solution19 {
    /**
     * Объединяет отсортированные массивы nums1 и nums2 в nums1 «in‑place».
     * Первые m элементов nums1 — значимые, далее место под n нулей.
     *
     * @param nums1 Массив длины m+n, в котором первые m элементов значимые.
     * @param m     Число значимых элементов в nums1.
     * @param nums2 Отсортированный массив длины n.
     * @param n     Длина nums2.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;         // указатель на последний значимый элемент nums1
        int p2 = n - 1;         // указатель на последний элемент nums2
        int write = m + n - 1;  // куда будем писать в nums1

        // Пока есть элементы в nums2, размещаем их и из nums1
        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[write--] = nums1[p1--];
            } else {
                nums1[write--] = nums2[p2--];
            }
        }
    }
}
