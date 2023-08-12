package org.example.programmers.java.level2;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        String s = "110010101001";
        System.out.println(solution(s));
    }

    public static int[] solution(String s) {
        int[] answer = {0, 0};
        while (!s.equals("1")) {
            int len = s.length();
            s = s.replace("0","");
            answer[1]+=len-s.length();
            s = Integer.toBinaryString(s.length());
            answer[0]++;
        }
        return answer;
    }
}
