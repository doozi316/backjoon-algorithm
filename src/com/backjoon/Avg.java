package com.backjoon;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        // 백준 1546번
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] arr = new int[cnt];
        int max = 0;
        for (int i = 0; i < cnt; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] > max)
                max = arr[i];
        }

        double sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += (double) arr[i] / max * 100;
        }

        System.out.println(sum / cnt);
    }
}
