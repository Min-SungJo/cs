package org.example.programmers.java.level0;

public class 인덱스_바꾸기 {
    public static void main(String[] args) {
        String my_string = "hello";
        int num1 = 1;
        int num2 = 2;
        System.out.println(solution(my_string, num1, num2));
    }

    private static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);
        String num1str = my_string.substring(num1, num1+1);
        sb.replace(num1, num1+1, my_string.substring(num2, num2+1));
        sb.replace(num2, num2+1, num1str);
        return sb.toString();
    }
}