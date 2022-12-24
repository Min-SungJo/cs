package org.example.programmers.java.level0;

public class 배열_자르기 {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(solution(numbers, num1, num2));
    }

    private static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int index =0;
        for(int i= num1; i<=num2;i++){
            answer[index++]=numbers[i];
        }
        return answer;
    }
}