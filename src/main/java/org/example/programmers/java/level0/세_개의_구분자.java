package org.example.programmers.java.level0;

import java.util.StringTokenizer;

public class 세_개의_구분자 {
    public static void main(String[] args) {

        String myStr = "baconlettucetomato";
        System.out.println(solution(myStr));
    }

    private static String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        int len = st.countTokens();
        if(st.countTokens()==0) return new String[] {"EMPTY"};
        String[] answer = new String[len];
        for(int i = 0; i < len; i++) {
            answer[i] = st.nextToken();
        }
        return answer;
    }
}