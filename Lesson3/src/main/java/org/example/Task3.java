package org.example;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7};
        int[] B = calculateSuffixSums(A);

        System.out.println("Массив A: " + Arrays.toString(A));
        System.out.println("Массив B: " + Arrays.toString(B));
    }

    public static int[] calculateSuffixSums(int[] A) {
        int n = A.length;
        int[] B = new int[n];

        B[n - 1] = A[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            B[i] = A[i] + B[i + 1];
        }

        return B;
    }
}
