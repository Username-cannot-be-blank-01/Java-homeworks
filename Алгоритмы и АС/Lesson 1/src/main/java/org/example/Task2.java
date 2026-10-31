package org.example;


import java.io.*;

public class Task2 {
    static int[] heap;
    static int size = 0;
    static void add(int x) {
        int i = size;
        heap[size++] = x;

        while (i > 0) {
            int parent = (i - 1) / 2;

            if (heap[i] < heap[parent]) {
                swap(i, parent);
                i = parent;
            } else {
                break;
            }
        }
    }

    static int getMin() {
        return heap[0];
    }

    static int pop() {
        int result = heap[0];
        heap[0] = heap[size - 1];
        size--;

        int i = 0;

        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }

            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }

            if (smallest == i) {
                break;
            }

            swap(i, smallest);
            i = smallest;
        }

        return result;
    }
    static void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        int n = Integer.parseInt(br.readLine().trim());
        heap = new int[n];
        StringBuilder result = new StringBuilder();

        for (int k = 0; k < n; k++) {
            String line = br.readLine().trim();

            if (line.startsWith("ADD")) {
                int x = Integer.parseInt(line.substring(4).trim());
                add(x);

            } else if (line.equals("MIN")) {
                result.append(getMin()).append('\n');

            } else if (line.equals("POP")) {
                result.append(pop()).append('\n');

            } else if (line.equals("SIZE")) {
                result.append(size).append('\n');
            }
        }

        System.out.print(result);
    }
}
