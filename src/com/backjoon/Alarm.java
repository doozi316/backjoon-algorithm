package com.backjoon;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        // 백준 2884번 문제
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        while(h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("0 ≤ H ≤ 23, 0 ≤ M ≤ 59 : 조건을 만족해야합니다.");
            h = scanner.nextInt();
            m = scanner.nextInt();
        }
        m = m - 45;
        if (m < 0) {
            m += 60;
            h -= 1;
            if (h < 0) {
                h += 24;
            }
        }

        System.out.println(h + " " + m);
    }
}
