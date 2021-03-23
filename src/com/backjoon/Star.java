package com.backjoon;

import java.io.*;

public class Star {
    public static void main(String[] args) throws IOException {
        // 백준 2438문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        while (n < 1 || n > 100) {
            bw.write("N은 1보다 같거나 크고 100보다 같거나 작아야합니다.");
            bw.flush();
            n = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
