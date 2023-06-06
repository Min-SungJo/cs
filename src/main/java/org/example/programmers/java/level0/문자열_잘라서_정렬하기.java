package org.example.programmers.java.level0;

import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {
    public static void main(String[] args) {
        String my_string = "xdxccxbbbxxaaaaxaaxabx";
        System.out.println(solution(my_string));
    }

    private static String[] solution(String myString) {
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        if(sb.charAt(0)=='x') {
            sb.delete(0,1);
            System.out.println(sb);
        }
        String str = sb.toString();
        String[] arr = str.replaceAll("x+","x").split("x");
        Arrays.sort(arr);
        return arr;
    }
}