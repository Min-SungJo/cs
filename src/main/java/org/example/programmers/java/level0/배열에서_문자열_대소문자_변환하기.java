package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.List;

public class 배열에서_문자열_대소문자_변환하기 {
    public static void main(String[] args) {

        String[] strArr = {"aBc","AbC"};
        String[] result = solution(strArr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    private static String[] solution(String[] strArr) {
        for(int i = 0; i < strArr.length; i++) {
            strArr[i]=(i%2==1)?(strArr[i].toUpperCase()):(strArr[i]=strArr[i].toLowerCase());
        }
        return strArr;
    }
}