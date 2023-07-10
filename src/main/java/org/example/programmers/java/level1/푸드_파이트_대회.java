package org.example.programmers.java.level1;

public class 푸드_파이트_대회 {

    public static void main(String[] args) {
        int[] food = {1, 7, 1, 2};
        System.out.println(solution(food));
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int len = food.length;
        for (int i = 1; i < len; i++) {
            int repeatCnt = food[i]/2;
            String str = Integer.toString(i);
            sb.append(str.repeat(repeatCnt));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb);
        sb2.reverse();
        sb.append(0).append(sb2);
        return sb.toString();
    }
}
