package com.backjoon;

import java.util.Scanner;

public class FourRuleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a < 1 || a > 10000 || b < 1 || b > 10000) {
            System.out.println("A, B는 0보다 크고 10000보다 같거나 작은 정수여야합니다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}

