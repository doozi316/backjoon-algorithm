package com.backjoon;

import java.util.Scanner;

public class LoopStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] resultArr = new String[n];
        for (int i = 0; i < n; i ++) {
            int r = scanner.nextInt();
            String input = scanner.next();
            StringBuilder resultStr = new StringBuilder();
            for (int x = 0; x < input.length(); x++) {
                for (int j = 0; j < r; j++) {
                    resultStr.append(input.charAt(x));
                }
            }
            resultArr[i] = resultStr.toString();
        }

        for (int i = 0; i < n; i ++) {
            System.out.println(resultArr[i]);
        }
    }
}
