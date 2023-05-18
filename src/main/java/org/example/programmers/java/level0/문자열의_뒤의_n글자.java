package org.example.programmers.java.level0;

public class 문자열의_뒤의_n글자 {
    public static void main(String[] args) {

        String str = "ProgrammerS123";
        int n = 11;
        String result = solution(str, n);
        System.out.println(result);
    }

    private static String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
}