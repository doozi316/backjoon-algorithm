package com.backjoon;

import java.util.Scanner;

public class CompareTwoNum {
    public static void main(String[] args) {
        // 백준 1330 번 문제
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (-10000 > a || a > 10000 || -10000 > b || b > 10000) {
            System.out.println("A, B는 -10000보다 같거나 크고 10000보다 같거다 작아야한다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
