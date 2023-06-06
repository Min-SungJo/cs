package org.example.programmers.java.level0;

public class 문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;
        System.out.println(solution(my_string, overwrite_string, s));
    }

    private static String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string, 0, s).append(overwrite_string).append(my_string.substring(s+overwrite_string.length()));
        return sb.toString();
    }
}