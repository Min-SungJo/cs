package org.example.programmers.java.level0;

public class 짝수는_싫어요 {
    public static void main(String[] args) {

        int numbers = 4;
        System.out.println(solution(numbers));
    }

    private static int[] solution(int n) {
        int size = (n%2==0)?n/2:n/2+1;
        int[] answer = new int[size];
        int index=0;
        for (int i =1; i<=n;i+=2){
            answer[index++]=i;
        }
//        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
        return answer;
    }
}