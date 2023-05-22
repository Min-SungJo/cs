package org.example.programmers.java.level0;

public class rny_string {
    public static void main(String[] args) {
        String rny_string = "programmers";
        String result = solution(rny_string);
        System.out.println(result);
    }

    private static String solution(String rny_string) {
        char[] arr = rny_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            if (c == 'm'){
                sb.append("rn");
            } else {
                sb.append(c);
            }
        }
        // rny_string.replace("m","rn");
        return sb.toString();
    }
}