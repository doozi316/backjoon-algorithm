package com.backjoon;

import java.io.*;

public class PrintN {
    public static void main(String[] args) throws IOException {
        // 백준 2741번 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        while (n > 100000) {
            bw.write("N은 100,000보다 작거나 같은 자연수여야합니다.");
            n = Integer.parseInt(br.readLine());
        }
        for (int i = 1; i <= n; i++) {
            bw.write(Integer.toString(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
