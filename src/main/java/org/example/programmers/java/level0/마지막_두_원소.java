package org.example.programmers.java.level0;

public class 마지막_두_원소 {
    public static void main(String[] args) {
        int[] num_list = {2, 1, 6};
        int[] result = solution(num_list);
        System.out.println(result);
    }

    private static int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] arr = new int[len+1];
        int n1 = num_list[len-1];
        int n2 = num_list[len-2];
        int n = n1 > n2 ? n1 - n2 : n1 * 2;
        for(int i = 0; i < len; i++) {
            arr[i] = num_list[i];
        }
        arr[len] = n;
        return arr;
    }
}