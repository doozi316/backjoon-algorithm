package com.backjoon;

import java.util.Scanner;

public class APlusB2 {
    public static void main(String[] args) {
        // 백준 10950번 문제
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            while (a < 1 || a > 9 || b < 1 || b > 9) {
                System.out.println("A, B는 0보다 크고 10보다 작아야합니다");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

            aArr[i] = a;
            bArr[i] = b;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(aArr[i] + bArr[i]);
        }
    }
}
