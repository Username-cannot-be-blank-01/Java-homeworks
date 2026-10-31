package org.example;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 34, 2, 45, 23, 12, 14, 31, 13, 31};
        int n = arr.length; // 11

        int[] evenArr = new int[(n + 1) / 2];
        for (int i = 0; i < n; i += 2) {
            evenArr[i / 2] = arr[i];
        }

        int[] oddArr = new int[n / 2];
        for (int i = 1; i < n; i += 2) {
            oddArr[i / 2] = arr[i];
        }

        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        System.out.println(Arrays.toString(evenArr));
        System.out.println(Arrays.toString(oddArr));
    }
}
