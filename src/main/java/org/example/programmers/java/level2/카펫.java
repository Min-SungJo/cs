package org.example.programmers.java.level2;

public class 카펫 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        System.out.println(solution(brown, yellow));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};
        int n = brown / 2 - 3;
        for (int i = 1; i <= (brown / 2 - 3); i++) {
            if (i * n == yellow) {
                answer[0] = n + 2;
                answer[1] = i + 2;
                break;
            }
            n--;
        }
        return answer;
    }
}
