package org.example.programmers.java.level0;

import java.io.*;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for(char c : arr) {
            if(c>64&&c<91) {
                c +=32;
            }else {
                c -= 32;
            }
            sb.append(c);
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}