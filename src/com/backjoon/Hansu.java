package com.backjoon;

import java.util.Scanner;

public class Hansu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(hansu(n));
    }

    public static int hansu(int n) {
        if (n < 100) return n;
        int cnt = 99;
        if (n == 1000)
            n--;
        for (int i = 100; i <= n; i++) {
            int one = i % 10;
            int ten = (i / 10) % 10;
            int hun =  i / 100;

            if ((hun - ten) == (ten - one))
                cnt++;
        }
        return cnt;
    }
}
