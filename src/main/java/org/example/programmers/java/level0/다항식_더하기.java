package org.example.programmers.java.level0;

import java.util.Arrays;
import java.util.HashMap;

public class 다항식_더하기 {
    public static void main(String[] args) {
        String polynomial = "1x + 7 + x";
        System.out.println(solution(polynomial));
    }

    private static String solution(String polynomial) {
        String[] arr = polynomial.split(" \\+ ");
        int sumNum = 0;
        int sumX = 0;
        for (String str : arr) {
            int xIdx = str.indexOf("x");
            if (xIdx == -1) {
                sumNum += Integer.parseInt(str);
            } else if (xIdx == 0) {
                sumX++;
            } else {
                String num = str.substring(0, xIdx);
                sumX += Integer.parseInt(num);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (sumX != 0) {
            if (sumX != 1) {
                sb.append(sumX);
            }
            sb.append("x");
        }
        if (sumX != 0 && sumNum != 0) {
            sb.append(" + ");
        }
        if (sumNum != 0) {
            sb.append(sumNum);
        }
        return sb.toString();
    }
}