package org.example.programmers.java.level2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 1;
        // 반복문을 통해 숫자를 1부터 1씩 증가시키면서 큐에 추가, 반복문은 입력값의 (2분의 1)+1까지 진행
        // 대입한 숫자들의 합이 15보다 작으면 큰 숫자를 추가, 15보다 크면 가장 작은 숫자를 제거
        // 15와 같으면 결과값 변수를 증가시키고 큰 숫자를 추가
        int sum = 0;
        int low = 1;
        int high = 0;
        int limit = n / 2 + 1;
        while (high <= limit && high != n) {
            if (sum == n) { // 입력값과 동일하면
                answer++;
                sum += ++high;
            } else if (sum < n) { // 입력값보다 작으면
                sum += ++high;
            } else if (sum > n) { // 입력값보다 크면
                sum -= low++;
            }
        }
        // 주어진 자연를 연속된 자연수의 합으로 표현하는 방법의 수는 약수중 홀수의 수를 합한 것과 같다
        answer = 0;
        for(int i = 1; i <= n; i+=2) {
            if(n%i==0) answer++;
        }
        return answer;
    }

}
