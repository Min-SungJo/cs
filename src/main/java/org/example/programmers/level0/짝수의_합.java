package org.example.programmers.level0;

import java.util.Scanner;

public class 짝수의_합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer=0;
        if(n%2==1){n--;}
        if(n>1){
            answer = (n/2+1)*n/2;
        }
        return answer;
    }
}