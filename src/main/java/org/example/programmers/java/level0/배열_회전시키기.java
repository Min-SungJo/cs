package org.example.programmers.java.level0;


public class 배열_회전시키기 {
    public static void main(String[] args) {
        int[] numbers = {49, 12, 100, 276, 33};
        String direction = "right";
        System.out.println(solution(numbers, direction));
    }

    private static int[] solution(int[] numbers, String direction) {
        // direction 조건에 따라 다르게 실행
        // right - 맨 오른쪽 숫자를 첫 번째 배열로 - 첫 번째 원소를 제일 마지막에 설정
        // left - 맨 왼쪽 숫자를 마지막 배열로 - 마지막 원소를 제일 마지막에 설정
        // 반복문을 사용
        int[] answer = new int[numbers.length];
        if (direction.equals("right")){
            for(int i = 0; i < numbers.length-1; i++) {
                answer[i+1] = numbers[i];
            }
            answer[0] = numbers[numbers.length-1];
        } else {
            for(int i = 0; i < numbers.length-1; i++) {
                answer[i] = numbers[i+1];
            }
            answer[answer.length-1] = numbers[0];
        }
        return answer;
    }
}