package org.example.programmers.java.level0;

public class A강조하기 {
    public static void main(String[] args) {
        String my_string = "PrOgRaMmErS";
        System.out.println(solution(my_string));
    }

    private static String solution(String myString) {
        return myString.toLowerCase().replaceAll("a","A");
    }
}