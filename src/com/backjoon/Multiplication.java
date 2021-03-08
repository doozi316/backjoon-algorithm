package com.backjoon;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // 백준 2588번 문제
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (100 > a || a > 999 || 100 > b || b > 999) {
            System.out.println("A 와 B는 세자리 수여야합니다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        int thirdB = b / 100; // 첫째자리 수
        int secB = (b % 100) / 10; // 둘째자리 수
        int firstB = (b % 100) % 10; // 셋째자리 수

        System.out.println(a * firstB);
        System.out.println(a * secB);
        System.out.println(a * thirdB);
        System.out.println(a * b);
    }
}
