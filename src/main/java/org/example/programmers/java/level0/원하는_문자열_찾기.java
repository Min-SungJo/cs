package org.example.programmers.java.level0;

public class 원하는_문자열_찾기 {
    public static void main(String[] args) {
        String myString = "AbCdEfG";
        String pat = "aBc";
        int result = solution(myString, pat);
        System.out.println(result);
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        if (myString.length() >= pat.length()) {
            myString = myString.toLowerCase();
            pat = pat.toLowerCase();
            int count = 0;
            int patIdx = 0;
            for (int i = 0; i < myString.length(); i++) {
                if (myString.charAt(i) == (pat.charAt(patIdx++))) {
                    count++;
                } else {
                    count = 0;
                    patIdx = 0;
                }
                if (count == pat.length()) {
                    return 1;
                }
            }
        }
        // indexOf 를 사용한 풀이
        if (myString.indexOf(pat) != -1){
            answer = 1;
        }
        return answer;
    }
}
