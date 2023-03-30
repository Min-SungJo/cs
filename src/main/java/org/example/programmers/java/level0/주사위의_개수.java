package org.example.programmers.java.level0;

public class 주사위의_개수 {
    public static void main(String[] args) {
        int[] box = {10,8,6};
        int n = 3;
        int result = solution(box, n);
        System.out.println(result);
    }
    public static int solution(int[] box, int n) {
        int answer = 1;
        for (int i : box) {
            answer *=i/n;
        }

        return answer;
    }
}
