package com.backjoon;

import java.util.Scanner;

public class APlusB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while((0 >= a || a >= 10) || (0 >= b || b >= 10)) {
            System.out.println("A와 B는 0보다 크고 10보다 작아야합니다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        System.out.println(a + b);
    }
}
