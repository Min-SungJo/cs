package org.example.programmers.java.level0;

public class 특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {

        String my_string = "programmers";
        String alp = "p";
        String result = solution(my_string, alp);
        System.out.println(result);
    }

    private static String solution(String my_string, String alp) {
        return my_string.replace(alp,alp.toUpperCase());
    }
}