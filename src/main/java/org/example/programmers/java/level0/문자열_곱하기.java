package org.example.programmers.java.level0;

public class 문자열_곱하기 {
    public static void main(String[] args) {

        String my_string = "string";
        int k = 3;
        String result = solution(my_string, k);
        System.out.println(result);
    }

    private static String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}