package org.example.programmers.java.level0;

import java.io.*;

public class 문자열_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        bw.write(str);
        bw.close();
        br.close();
    }
}