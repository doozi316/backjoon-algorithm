package com.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB5 {
    public static void main(String[] args) throws IOException {
        // 백준 10952번 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        StringTokenizer st = new StringTokenizer(input);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (a < 0 || a >= 10 || b < 0 || b >= 10) {
            bw.write("0 < A, B < 10 조건을 만족해야합니다.");
            bw.newLine();
            bw.flush();
            input = br.readLine();
            StringTokenizer sToken = new StringTokenizer(input);
            a = Integer.parseInt(sToken.nextToken());
            b = Integer.parseInt(sToken.nextToken());
        }

        while (a != 0 && b != 0) {
            int result = a + b;

            bw.write(Integer.toString(result));
            bw.newLine();

            input = br.readLine();

            StringTokenizer str = new StringTokenizer(input);

            a = Integer.parseInt(str.nextToken());
            b = Integer.parseInt(str.nextToken());

            while (a < 0 || a >= 10 || b < 0 || b >= 10) {
                bw.write("0 < A, B < 10 조건을 만족해야합니다.");
                bw.newLine();
                bw.flush();
                input = br.readLine();
                StringTokenizer sToken = new StringTokenizer(input);
                a = Integer.parseInt(sToken.nextToken());
                b = Integer.parseInt(sToken.nextToken());
            }
        }

        bw.flush();
        bw.close();
    }
}
