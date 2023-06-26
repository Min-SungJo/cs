package org.example.programmers.java.level0;


public class k의_개수 {
    public static void main(String[] args) {

        int i = 10;
        int j = 50;
        int k = 5;
        System.out.println(solution(i, j, k));
    }

    private static int solution(int i, int j, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int ii = i; ii <= j; ii++) {
            sb.append(ii);
            for(int iii = 0; iii < sb.length(); iii++) {
                if(sb.charAt(iii)-'0'==k) {
                    sum++;
                }
            }
            sb.setLength(0);
        }
        return sum;
    }
}