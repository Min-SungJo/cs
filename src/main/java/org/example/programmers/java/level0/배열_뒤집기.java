package org.example.programmers.java.level0;

public class 배열_뒤집기 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int index =num_list.length-1;
        for (int i : num_list){
            answer[index--]=i;
        }

        return answer;
    }
}