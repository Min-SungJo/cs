package org.example.programmers.java.level0;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(solution(my_str, n));
    }

    private static String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length() - 1) / n + 1];
        for (int i = 0; i < answer.length; i++) {
            int start = i * n;
            int end = (i + 1) * n;
            if (end > my_str.length()) {
                end = my_str.length();
            }
            String str = my_str.substring(start, end);
            answer[i] = str;
        }
        return answer;
    }
}