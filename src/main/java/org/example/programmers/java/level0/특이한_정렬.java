package org.example.programmers.java.level0;

import java.util.*;

public class 특이한_정렬 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
//        int[] numlist = {1, 2, 5, 4, 3, 6};
        int n = 4;
        System.out.println(solution(numlist, n));
    }

    private static int[] solution(int[] numlist, int n) {
        //n 과 가까운 수부터 정렬, 거리가 같다면 더 큰 수를 앞에 오도록
        int len = numlist.length;
//        List<Integer> list = new ArrayList<>();
//        for(int i : numlist) list.add(i);
//        Collections.reverse(list);
//        list.sort(Comparator.comparingInt(num -> Math.abs(num - n)));
//        int[] answer = new int[len];
//        answer[0] = list.get(0);
//        for(int i = 1; i < len; i++) {
//            answer[i] = list.get(i);
//            if(Math.abs(list.get(i-1)-n)==Math.abs(list.get(i)-n)) {
//                if(answer[i-1]< answer[i]) {
//                    swap(answer, i-1,i);
//                }
//            }
//        }

        int[] answer = numlist.clone();
        for(int i = 0; i < len - 1; i++) {
            for(int j = i+1; j < len; j++) {
                boolean isSwap = false;
                int num1 = Math.abs(answer[i]-n);
                int num2 = Math.abs(answer[j]-n);
                if(num1 > num2) {
                    isSwap = true;
                } else if(num1 == num2 && (answer[i]<answer[j])) {
                    isSwap = true;
                }
                if(isSwap) {
                    swap(answer, i, j);
                }
            }
        }
        return answer;
    }

    private static void swap(int[] list, int idx1, int idx2) {
        int temp = list[idx1];
        list[idx1] = list[idx2];
        list[idx2] = temp;
    }
}