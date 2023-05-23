package org.example.programmers.java.level0;

public class 접두사인지_확인하기 {
    public static void main(String[] args) {
        String my_string = "bananana";
        String is_prefix = "ban";
        System.out.println(solution(my_string,is_prefix));
    }

    private static int solution(String my_string, String is_prefix) {
//        return my_string.indexOf(is_prefix)==0?1:0;
        return my_string.startsWith(is_prefix)?1:0;
    }
}