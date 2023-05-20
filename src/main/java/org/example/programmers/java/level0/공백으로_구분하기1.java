package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.List;

public class 공백으로_구분하기1 {
    public static void main(String[] args) {

        String my_string = "i love you";
        String[] result = solution(my_string);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

    private static String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        List<String> arrayList = new ArrayList<>();
        for (char c : my_string.toCharArray()) {
            if (c == ' ') {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }else{
                sb.append(c);
            }
        }
        arrayList.add(sb.toString());
//        List<String> arrayList = new ArrayList<>(List.of(my_string.split(" ")));
        return arrayList.toArray(new String[0]);
    }
}