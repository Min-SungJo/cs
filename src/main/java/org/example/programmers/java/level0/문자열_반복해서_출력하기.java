package org.example.programmers.java.level0;

import java.io.*;
import java.util.StringTokenizer;

public class 문자열_반복해서_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputStr = br.readLine();
        StringTokenizer st = new StringTokenizer(inputStr);
        String outputStr = st.nextToken();
        int repeatNum = Integer.parseInt(st.nextToken());
        bw.write(outputStr.repeat(repeatNum));
        bw.close();
        br.close();
    }
}