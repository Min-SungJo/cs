package org.example.programmers.java.level0;

public class 부분_문자열인지_확인하기 {
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";
        int result = solution(my_string, target);
        System.out.println(result);
    }

    private static int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}