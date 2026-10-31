package org.example;

import java.io.*;
import java.util.*;

public class Task3 {
    static ArrayList<Integer>[] graph;
    static int[] dist;

    static int bfs(int s, int t, int n) {

        Queue<Integer> queue = new ArrayDeque<>();
        dist = new int[n + 1];
        Arrays.fill(dist, -1);

        queue.add(s);
        dist[s] = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            if (v == t) {
                return dist[v];
            }

            for (int u : graph[v]) {
                if (dist[u] == -1) {
                    dist[u] = dist[v] + 1;
                    queue.add(u);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        System.out.println(bfs(s, t, n));
    }
}
