package org.example.programmers.java.level0;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        String x = "abc";
        int n =3;
        System.out.println(solution(x,n));
    }

    private static String solution(String my_string, int n) {
        String answer= "";
        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<n;j++) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}