package org.example.programmers.java.level0;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public static void main(String[] args) {
        String myString = "AbCdEFG";
        String pat = "dE";
        System.out.println(solution(myString, pat));
    }

    private static String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        sb.append(myString);
        for (int i = sb.length() - 1; i >= 0; i--) {
            boolean isEqual = false;
            for (int j = pat.length() - 1; j >= 0; j--) {
                isEqual = sb.charAt(i) != pat.charAt(j);
                if (!isEqual) {
                    sb.setLength(i);
                    break;
                } else {
                    i--;
                }
            }
            if(isEqual) {
                return sb.toString();
            }
        }
        return "";
    }
}