package org.example.programmers.java.level1;

public class 하샤드_수 {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(solution(x));
    }

    public static boolean solution(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        int sum = 0;
        for (int i = 0; i < sb.length(); i++) {
            sum += sb.charAt(i) - '0';
        }
        return x % sum == 0;
    }
}