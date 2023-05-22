package org.example.programmers.java.level0;

public class 개미_군단 {
    public static void main(String[] args) {
        int hp = 23;
        int result = solution(hp);
        System.out.println(result);
    }

    private static int solution(int hp) {
        int answer = 0;
        int[] ant = {5,3,1};
        for(int i : ant){
            answer+=hp/i;
            hp%=i;
        }
        return answer;
    }
}