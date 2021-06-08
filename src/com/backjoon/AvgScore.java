package com.backjoon;

import java.util.Scanner;

public class AvgScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();
        double[] result = new double[c];
        for (int i = 0; i < c; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            double avg = (double) sum/n;

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] > avg)
                    cnt++;
            }
            result[i] = (double) cnt/n * 100;
        }

        for (int i = 0; i < c; i ++) {
            System.out.println(String.format("%.3f", result[i]) + "%");
        }
    }
}
