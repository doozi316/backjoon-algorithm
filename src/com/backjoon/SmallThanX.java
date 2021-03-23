package com.backjoon;

import java.io.*;
import java.util.Scanner;

public class SmallThanX {
    public static void main(String[] args) throws IOException {
        // 백준 10871번 문제
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        while (n < 1 || n > 10000 || x < 1 || x > 10000) {
            System.out.println("n,x는 1보다 같거나 크고 10000보다 같거나 작아야합니다.");
            n = scanner.nextInt();
            x = scanner.nextInt();
        }

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            while (a[i] < 1 || a[i] > 10000) {
                System.out.println("수열 A는 모두 1보다 같거나 크고 10000보다 같거나 작아야합니다.");
                a[i] = scanner.nextInt();
            }
        }

        for (int value : a) {
            if (value < x)
                System.out.print(value + " ");
        }
    }
}
