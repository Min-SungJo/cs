package org.example.programmers.java.level0;

public class 문자열_여러번_뒤집기 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(my_string, queries));
    }

    private static String solution(String my_string, int[][] queries) {
        for (int[] list : queries) {
            int s = list[0];
            int e = list[1]+1;
            StringBuilder sb1 = new StringBuilder();
            sb1.append(my_string, 0, s);
            StringBuilder sb2 = new StringBuilder(my_string.substring(s,e)).reverse();
            sb1.append(sb2);
            sb1.append(my_string, e, my_string.length());
            my_string = sb1.toString();
        }
        return my_string;
    }
}