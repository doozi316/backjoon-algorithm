package com.backjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MaxVal {
    public static void main(String[] args) throws IOException {
        // 백준 2562번
        // System.out.println
        int[] input = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            input[i] = sc.nextInt();
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (input[i] > max) {
                max = input[i];
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);

        // BufferReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String numStr = br.readLine();
//        StringTokenizer stringTokenizer = new StringTokenizer(numStr);
//        int[] arr = new int[9];
//        int max = 0;
//        int idx = 0;
//        for (int i = 0; i < 9; i++) {
//            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
//            if (max < arr[i]) {
//                max = arr[i];
//                idx = i + 1;
//            }
//        }
//
//        bw.write(String.valueOf(max));
//        bw.newLine();
//        bw.write(String.valueOf(idx));
//        bw.flush();
//        br.close();
//        bw.close();
    }
}
