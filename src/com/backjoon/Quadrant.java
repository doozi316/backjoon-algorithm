package com.backjoon;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        // 백준 14681 번 문제
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x == 0 || x < -1000 || x > 1000 || y == 0 || y < -1000 || y > 1000) {
            System.out.println("x, y를 다시 입력해주세요. (−1000 ≤ x ≤ 1000; x ≠ 0; −1000 ≤ y ≤ 1000; y ≠ 0)");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if (y > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}
