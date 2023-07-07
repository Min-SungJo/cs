package org.example.programmers.java.level0;

import java.util.ArrayList;

public class 배열_만들기2 {
    public static void main(String[] args) {
        int l = 10;
        int r = 20;
        System.out.println(solution(l, r));
    }

    public static int[] solution(int l, int r) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num10 = 1;
        int num5;
        do {
            num5 = numTo5(num10);
            if (num5 >= l && num5 <= r) {
                arrayList.add(num5);
            }
            num10++;
        } while (num5 <= r);
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int i : arrayList) {
            answer[idx++] = i;
        }
        if (answer.length == 0) return new int[]{-1};
        return answer;
    }

    private static int numTo5(int n) {
//        return Integer.parseInt(Integer.toString(n, 2).replace("1", "5"));
        return Integer.parseInt(Integer.toBinaryString(n)) * 5;
    }
}