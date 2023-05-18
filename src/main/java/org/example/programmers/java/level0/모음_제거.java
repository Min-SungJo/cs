package org.example.programmers.java.level0;

public class 모음_제거 {
    public static void main(String[] args) {

        String my_string = "nice to meet you";
        String result = solution(my_string);
        System.out.println(result);
    }

    private static String solution(String my_string) {
        // 나의 풀이 방법
        String[] vowel = {"a", "e", "i", "o", "u"};
        for(String str : vowel) {
            my_string = my_string.replaceAll(str,"");
        }
//        my_string = my_string.replaceAll("[aeiou]",""); 정규 표현식을 사용한 풀이법1
//        my_string = my_string.replaceAll("a|e|e|o|u",""); 정규 표현식을 사용한 풀이법2
        return my_string;
    }
}