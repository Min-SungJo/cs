package org.example.programmers.java.level0;

import java.io.*;

public class 특수문자_출력하기 {
    public static void main(String[] args) throws IOException {
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        br.write("!@#$%^&*(\\'\"<>?:;");
        br.close();
    }
}