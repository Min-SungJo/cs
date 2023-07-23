package org.example.programmers.java.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class 명예의_전당1 {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(solution(k, score));
    }

    private static int[] solution(int k, int[] score) {
        int[] arr = new int[score.length];
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < score.length; i++) {
//            int n = score[i];
//            System.out.println("i: "+i+" n: "+n);
//            int size = arrayList.size();
//            arrayList.add(n);
//            Collections.sort(arrayList);
//            if (size >= k) {
//                arrayList.remove(0);
//            }
//            System.out.println("++: "+arrayList.get(0));
//            arr[i]=arrayList.get(0);
//        }

        // 우선순위 큐, 낮은 숫자부터 저장
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int temp = 0;
        for (int i = 0; i < score.length; i++) {
            temp = score[i];
            priorityQueue.add(temp);
            if (priorityQueue.size() > k) {
                priorityQueue.poll(); // 첫번째 값을 제거하고 반환(최소값), 비어있으면 null 반환
            }
            arr[i] = priorityQueue.peek();
        }
        return arr;
    }
}