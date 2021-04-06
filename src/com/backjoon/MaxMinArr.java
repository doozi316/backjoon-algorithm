package com.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class MaxMinArr {
    public static void main(String[] args) throws IOException {
        // 백준 10818번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int n = Integer.parseInt(input);

        int[] arr = new int[n];
        String numStr = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(numStr);
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        int max = arr[0], min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}
