package com.backjoon;

import java.util.Scanner;

public class OX {
    public static void main(String[] args) {
        // 백준 8958번
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        int[] resultArr = new int[cnt];
        for (int i = 0; i < cnt; i ++) {
            int sum = 0;
            int state = 0;
            String input = scanner.next();
            for (int j = 0; j < input.length(); j++) {
                int inputChar = input.charAt(j);
                if (inputChar == 'X') {
                    state = 0;
                    sum += state;
                }
                else if (inputChar == 'O') {
                    state++;
                    sum += state;
                }
            }
            resultArr[i] = sum;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
