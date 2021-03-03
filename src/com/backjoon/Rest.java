package com.backjoon;

import java.util.Scanner;

public class Rest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        while (a < 2 || a > 10000 || b < 2 || b > 10000 || c < 2 || c > 10000) {
            System.out.println("A, B, C는 1보다 크고 10000보다 같거나 작은 정수여야합니다.");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }
        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
}
