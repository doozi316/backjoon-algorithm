package com.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class FastAPlusB {
    public static void main(String[] args) {
        // 백준 15552번 문제
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int t = Integer.parseInt(br.readLine());
            while (t > 1000000) {
                bw.write("T는 최대 1,000,000입니다.");
                t = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < t; i++) {
                String numStr = br.readLine();
                StringTokenizer st = new StringTokenizer(numStr);
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                String result = Integer.toString(a + b);
                bw.write(result);
                bw.newLine();
            }

            bw.flush();
            bw.close();

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
