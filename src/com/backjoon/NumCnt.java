package com.backjoon;

import java.util.Scanner;

public class NumCnt {
    public static void main(String[] args) {
        // 백주 2577번

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a * b * c;
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        while (result != 0) {
            int num = result % 10;
            arr[num] += 1;
            result /= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
