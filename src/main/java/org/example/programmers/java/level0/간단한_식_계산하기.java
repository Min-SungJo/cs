package org.example.programmers.java.level0;

public class 간단한_식_계산하기 {
    public static void main(String[] args) {
        String binomial = "43 + 12";
        System.out.println(solution(binomial));
    }

    private static int solution(String binomial) {
        String[] arr = binomial.split(" ");
        int answer = 0;
        char op = arr[1].charAt(0);
        if (op == '+') {
            answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
        } else if (op == '-') {
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
        } else {
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        return answer;
    }
}