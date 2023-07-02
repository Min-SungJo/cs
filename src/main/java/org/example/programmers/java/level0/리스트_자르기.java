package org.example.programmers.java.level0;

public class 리스트_자르기 {
    public static void main(String[] args) {
        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(solution(n, slicer, num_list));
    }

    private static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int interval = 1;
        int len = num_list.length;
        int newLen = 0;
        int start = 0;
        int end = 0;
        switch (n) {
            case 1:
                //1 -> 0부터 b
                end = b;
                newLen = b;
                break;
            case 2:
                //2 -> a부터
                start = a;
                end = len;
                newLen = len-a;
                break;
            case 3:
                //3 -> a부터 b
                start = a;
                end = b;
                newLen = b-a+1;
                break;
            case 4:
                //4 -> a부터 b까지 c 간격
                start = a;
                end = b;
                interval = c;
                newLen = (b-a)/c+1;
                break;
            default:
                break;
        }
        int[] answer = new int[newLen];
        int idx = 0;
        for(int i = start; i <= end; i += interval) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}