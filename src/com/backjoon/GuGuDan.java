package com.backjoon;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        // 백준 2739번 문제
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n < 1 || n > 9) {
            System.out.println("n은 1보다 크거나 같고, 9보다 작거나 같아야합니다.");
            n = scanner.nextInt();
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
