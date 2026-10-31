package org.example;

// Counting sort
// Сложность алгоритма:
// Время: O(n + k);
// Память: O(k);


import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arr1 = {10000, 0, 25, 25};
        countingSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {7, 2, 7, 4};
        countingSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void countingSort(int[] arr) {
        int max = 10000;
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }
}

