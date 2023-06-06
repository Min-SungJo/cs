package org.example.programmers.java.level0;

import java.io.*;
import java.util.StringTokenizer;

public class a_와_b_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder();
        sb.append("a = ").append(st.nextToken()).append("\n");
        bw.write(sb.toString());
        sb.setLength(0);
        sb.append("b = ").append(st.nextToken());
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}