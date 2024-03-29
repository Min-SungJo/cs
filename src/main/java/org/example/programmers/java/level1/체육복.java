package org.example.programmers.java.level1;

import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
//        int n = 5;
//        int[] lost = {2, 4};
//        int[] reserve = {1, 3, 5};
        int n = 5;
        int[] lost = {1,2};
        int[] reserve = {2, 3};
        System.out.println(solution(n, lost, reserve));
    }

    private static int solution(int n, int[] lost, int[] reserve) {
//        Arrays.sort(lost);
//        Arrays.sort(reserve);
//        int answer = n - lost.length;
//        for (int i = 0; i < lost.length; i++) {
//            for (int j = 0; j < reserve.length; j++) {
//                if (lost[i]<reserve[j]) break;
//                if (lost[i] == reserve[j]) {
//                    answer++;
//                    lost[i] = -1;
//                    reserve[j] = -1;
//                    break;
//                }
//            }
//        }
//        for (int i = 0; i < lost.length; i++) {
//            int lostNum = lost[i];
//            for (int j = 0; j < reserve.length; j++) {
//                if (lost[i]<reserve[j]-1) break;
//                int reserveNum = reserve[j];
//                if (reserveNum == lostNum -1 || reserveNum == lostNum +1) {
//                    answer++;
//                    lost[i] = -1;
//                    reserve[j] = -1;
//                    break;
//                }
//            }
//        }
        int[] people = new int[n];
        int answer = n;
        printList(people);
        System.out.println();
        printList(lost);
        for (int l : lost)
            people[l-1]--;
        printList(people);
        System.out.println();
        printList(reserve);
        for (int r : reserve)
            people[r-1]++;
        printList(people);
        for (int i = 0; i < people.length; i++) {
            if(people[i] == -1) {
                if(i-1>=0 && people[i-1] == 1) {
                    people[i]++;
                    people[i-1]--;
                }else if(i+1< people.length && people[i+1] == 1) {
                    people[i]++;
                    people[i+1]--;
                }else
                    answer--;
            }
        }
        return answer;
    }
    private static void printList(int[] list) {
        System.out.println(" print ");
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
}