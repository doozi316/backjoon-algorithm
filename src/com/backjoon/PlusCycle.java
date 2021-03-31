package com.backjoon;

import java.util.Scanner;

public class PlusCycle {
    // 백준 1110번 문제
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int total = n;
        int cycle = 0;

        do {
            cycle += 1;
            int first = total / 10;
            int second = total % 10;
            int result = first + second;
            total = second * 10 + result % 10;

        } while (total != n);
        System.out.println(cycle);
    }
}
