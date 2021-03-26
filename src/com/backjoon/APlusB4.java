package com.backjoon;

import java.io.*;
import java.util.Scanner;

public class APlusB4 {
    // 백준 10951번 문제
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            while (a < 0 || a >= 10 || b < 0 || b >= 10) {
                System.out.println("0 < A, B < 10 조건을 만족해야합니다.");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

            System.out.println(a+b);
        }
    }
}
