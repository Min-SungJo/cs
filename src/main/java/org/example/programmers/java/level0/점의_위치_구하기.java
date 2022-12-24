package org.example.programmers.java.level0;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        int[] dot = {1,-3};
        System.out.println(solution(dot));
    }

    private static int solution(int[] dot) {
        int answer=1;
        int x = dot[0];
        int y = dot[1];
        if(x>0&&y<0){
            answer+=3;
        } else if (x<0) {
            if(y>0){
                answer++;
            }else {
                answer+=2;
            }
        }
        return answer;
    }
}