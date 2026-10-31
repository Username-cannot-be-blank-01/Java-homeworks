package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 8, 2, 1, 4, 6, 7}; // 8
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println((i + 1) + " " + (j + 1));
                    return;
                }
            }
        }
    }
}
