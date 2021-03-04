package com.backjoon;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        while (0 > a || a > 100) {
            System.out.println("A는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.");
            a = scanner.nextInt();
        }

        if (90 <= a) {
            System.out.println("A");
        } else if (80 <= a) {
            System.out.println("B");
        } else if (70 <= a) {
            System.out.println("C");
        } else if (60 <= a) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
