package com.backjoon;

import java.io.*;
import java.util.StringTokenizer;

public class CaseAPlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String numStr = br.readLine();
            StringTokenizer st = new StringTokenizer(numStr);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a + b;
            String resultStr = "Case #" + i + ": " + result;
            bw.write(resultStr);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
