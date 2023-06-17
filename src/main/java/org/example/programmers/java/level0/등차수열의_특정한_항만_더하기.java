package org.example.programmers.java.level0;

public class 등차수열의_특정한_항만_더하기 {
    public static void main(String[] args) {
        int a = 3;
        int d = 4;
        boolean[] included = {true, false, false, true, true};
        System.out.println(solution(a, d, included));
    }

    private static int solution(int a, int d, boolean[] included) {
        int sum = 0;
        int length = included.length;
        for (int i = 0; i < length; i++) {
            if (included[i]) {
                sum += a + (i) * d;
            }
        }
        return sum;
    }
}