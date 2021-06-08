package com.backjoon;

import java.util.Scanner;

public class Test {
    public static long sum(int[] a) {
        int sum = 0;
        for(int num : a) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(sum(arr));
    }
}
