package org.example.programmers.java.level0;

import java.util.ArrayList;

public class 배열_만들기5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;
        System.out.println(solution(intStrs, k, s, l));
    }

    private static int[] solution(String[] intStrs, int k, int s, int l) {
        int len = intStrs.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(num>k) {
                arrayList.add(num);
            }
        }
        int idxLen = arrayList.size();
        int[] answer = new int[idxLen];
        for(int i = 0 ; i < idxLen; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}