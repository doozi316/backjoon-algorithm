package com.backjoon;

import java.util.Scanner;

public class AMinusB {
    public static void main(String[] args) {
        // 백준 1001번 문제
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a <= 0 || a >= 10 || b <= 0 || b >= 10) {
            System.out.println("A, B는 0보다 크고 10보다 작은 정수여야합니다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.println(a - b);
    }
}
