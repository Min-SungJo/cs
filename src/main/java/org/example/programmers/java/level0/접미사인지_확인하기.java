package org.example.programmers.java.level0;

public class 접미사인지_확인하기 {
    public static void main(String[] args) {
        String my_string = "bananana";
        String is_suffix = "ana";
        System.out.println(solution(my_string,is_suffix));
    }

    private static int solution(String my_string, String is_suffix) {
        return my_string.endsWith(is_suffix)?1:0;
    }
}