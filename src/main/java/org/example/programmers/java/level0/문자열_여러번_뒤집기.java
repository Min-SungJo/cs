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
            StringBuilder builder = new StringBuilder();
            builder.append(my_string, 0, s);
            StringBuffer buffer = new StringBuffer(my_string.substring(s,e)).reverse();
            builder.append(buffer);
            builder.append(my_string, e, my_string.length());
            my_string = builder.toString();
        }
        return my_string;
    }
}