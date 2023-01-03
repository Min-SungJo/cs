package org.example.programmers.java.level0;


public class 각도기 {
    public static void main(String[] args) {
    
        System.out.println(solution(20));
    }

    private static int solution(int n) {

        int answer =n/gcd(n,6);
        return answer;
    }
    
    public static int gcd(int n, int m){
        if(m==0) return n;
        return gcd(m, n%m);
    }
}
