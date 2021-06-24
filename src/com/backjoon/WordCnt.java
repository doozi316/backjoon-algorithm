package com.backjoon;

import java.util.Scanner;

public class WordCnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strArr = input.split(" ");
        int cnt = strArr.length;
        for (String str : strArr) {
            if (str.length() == 0)
                cnt--;
        }
        System.out.println(cnt);
    }
}
