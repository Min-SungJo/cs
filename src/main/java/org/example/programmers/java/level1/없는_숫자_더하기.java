package org.example.programmers.java.level1;

public class 없는_숫자_더하기 {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int sum = 45;
        for(int i : numbers) {
            sum-=i;
        }
        return sum;
    }
}
