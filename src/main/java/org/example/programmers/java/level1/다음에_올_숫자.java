package org.example.programmers.java.level1;

public class 다음에_올_숫자 {
    public static void main(String[] args) {
//        int[] common = {1, 2, 3, 4};
        int[] common = {2, 4, 8};
        System.out.println(solution(common));
    }

    private static int solution(int[] common) {
        boolean ap = false;
        int answer = common[common.length - 1];

        if (common[0] - common[1] == common[1] - common[2]) {
            ap = true;
        }

        if (ap) {
            answer += common[1] - common[0];
        } else {
            answer *= common[1] / common[0];
        }
        return answer;
    }
}