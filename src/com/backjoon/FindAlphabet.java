package com.backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class FindAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int[] resultArr = new int[alphabet.length];
        Arrays.fill(resultArr, -1);

        for (int i = 0; i < alphabet.length; i++) {
            for (int j = 0; j < S.length(); j++) {
                if (alphabet[i] == S.charAt(j)) {
                    if (resultArr[i] == -1)
                        resultArr[i] = j;
                }
            }
        }

        for (int value : resultArr) {
            System.out.print(value + " ");
        }
    }
}
