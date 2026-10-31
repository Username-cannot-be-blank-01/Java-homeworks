package org.example;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void quickSort(int[] a, int left, int right) {
        int i = left;
        int j = right;
        int pivot = a[left + (right - left) / 2];

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(a, left, j);
        }

        if (i < right) {
            quickSort(a, i, right);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(a, 0, n - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(a[i]);

            if (i < n - 1) {
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
