package org.example.programmers.java.level2;

public class 다음_큰_숫자 {
    public static void main(String[] args) {
        int n = 78;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        // 출력값을 이진수로 변환했을 때 1의 개수는, 입력값을 이진수로 변환했을 때 1의 개수와 동일하다
        // 반복문을 통해 입력값을 증가시키고, 이진수로 변환하여 1의 개수가 동일한지 확인
        // 동일한 값을 반환
        int cnt = Integer.bitCount(n);

        while (true) {
            ++n;
            if(Integer.bitCount(n) == cnt) break;
        }
        return n;
    }

}
