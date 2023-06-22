package org.example.programmers.java.level1;

public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        int repeatCnt = n/2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < repeatCnt; i++) {
            sb.append("수박");
        }
        if(n%2==1) {
            sb.append("수");
        }
        return sb.toString();
    }

}