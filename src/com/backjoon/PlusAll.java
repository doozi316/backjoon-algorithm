package com.backjoon;

import java.util.Scanner;

public class PlusAll {
    public static void main(String[] args) {
        // 백준 8393번 문제
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        while(n < 1 || n > 10000) {
            System.out.println("1 ≤ n ≤ 10,000 : n이 조건을 만족하지 않습니다.");
            n = scanner.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
