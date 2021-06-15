package com.backjoon;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(sum);
    }
}
