package com.backjoon;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // 백준 2753 번 문제
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        while (year < 1 || year > 4000) {
            System.out.println("년도는 1보다 크거나 같고 4000보다 작거나 같은 자연수여야합니다.");
            year = scanner.nextInt();
        }

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
