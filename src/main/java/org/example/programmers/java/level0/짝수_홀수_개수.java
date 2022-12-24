package org.example.programmers.java.level0;

public class 짝수_홀수_개수 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4};
        System.out.println(solution(numbers));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int i : num_list){
            if ((i % 2 == 0)) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }
        return answer;
    }
}