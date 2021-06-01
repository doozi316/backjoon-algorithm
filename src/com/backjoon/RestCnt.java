package com.backjoon;

import java.util.Scanner;

public class RestCnt {
    // 백준 3052번
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt() % 42;
        }

        int sameCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] != null && arr[j] != null && arr[i].equals(arr[j])) {
                    sameCnt++;
                    arr[j] = null;
                }
            }
        }
        System.out.println(10 - sameCnt);
    }
}
