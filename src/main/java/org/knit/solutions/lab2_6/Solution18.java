package org.knit.solutions.lab2_6;

public class Solution18 {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;
        // Считаем, сколько нулей будем дублировать (в пределах массива)
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        // i — оригинальный индекс, j — «виртуальный» индекс с учётом дубликаций
        int i = n - 1;
        int j = n - 1 + zeros;
        // Проходим с конца, копируя элементы туда, куда попадают после сдвига
        while (i >= 0) {
            if (j < n) {
                arr[j] = arr[i];
            }
            // Если это ноль — дублируем, то есть ещё одно записываем в j-1
            if (arr[i] == 0) {
                j--;
                if (j < n) {
                    arr[j] = 0;
                }
            }
            i--;
            j--;
        }

//        for (int k=0; k<=arr.length - 1; k++){
//            System.out.print(arr[k] + ", ");
//        }
    }
//    public static void Run() {
//        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
//    }
}
