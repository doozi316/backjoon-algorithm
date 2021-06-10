package com.backjoon;

public class SelfNum {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i <= 10000; i ++) {
            int num = d(i);
            if (num <= 10000) {
                arr[num] = true;
            }
        }

        for (int i = 1; i <= 10000; i ++) {
            if (! arr[i])
                System.out.println(i);
        }
    }

    public static int d(int num) {
        int result = num;
        int sum = num;
        do {
            sum += result % 10;
            result /= 10;
        } while (result != 0);
        return sum;
    }
}
