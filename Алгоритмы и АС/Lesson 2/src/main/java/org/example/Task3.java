package org.example;

// Bucket sort
// Сложность алгоритма:
// Время: O(n + k);
// Память: O(k);

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] arr1 = {0.55, 0.05, 0.95, 0.35};
        bucketSort(arr1);
        System.out.println(Arrays.toString(arr1));

        double[] arr2 = {0.12, 0.13, 0.90};
        bucketSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n == 0) {
            return;
        }

        ArrayList<ArrayList<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            buckets.add(new ArrayList<>());
        }

        for (double num : arr) {
            int index = (int) (num * n);
            buckets.get(index).add(num);
        }

        for (ArrayList<Double> bucket : buckets) {
            for (int i = 1; i < bucket.size(); i++) {
                double key = bucket.get(i);
                int j = i - 1;

                while (j >= 0 && bucket.get(j) > key) {
                    bucket.set(j + 1, bucket.get(j));
                    j--;
                }

                bucket.set(j + 1, key);
            }
        }

        int index = 0;
        for (ArrayList<Double> bucket : buckets) {
            for (double num : bucket) {
                arr[index] = num;
                index++;
            }
        }
    }
}
