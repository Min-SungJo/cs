package org.example.programmers.java.level0;

import java.util.ArrayList;

public class 콜라츠_수열_만들기 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        int temp = 0;
        int idx = 0;
        while (temp != 1) {
            temp = arrayList.get(idx++);
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = (temp * 3) + 1;
            }
            arrayList.add(temp);
        }
        int len = arrayList.size();
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}