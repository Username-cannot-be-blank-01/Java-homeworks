package org.example;

// Radix sort
// Сложность алгоритма:
// Время: O(d × (n + k));
// Память: O(n + k);

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr1 = {500, 12, 99999999, 42};
        radixSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {101, 10, 1};
        radixSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void radixSort(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];

        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {

            int[] count = new int[10];
            for (int num : arr) {
                int digit = (num / exp) % 10;
                count[digit]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            System.arraycopy(output, 0, arr, 0, n);
        }
    }
}