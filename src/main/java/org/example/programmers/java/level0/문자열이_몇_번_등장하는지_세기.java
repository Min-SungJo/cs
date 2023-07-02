package org.example.programmers.java.level0;

public class 문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
        String my_string = "banana";
        String pat = "ana";
        System.out.println(solution(my_string, pat));
    }

    private static int solution(String myString, String pat) {
        int answer = 0;
        int len = myString.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(myString.substring(i));
            if(sb.indexOf(pat)==0) {
                answer++;
            }
            sb.setLength(0);
        }
        return answer;
    }
}