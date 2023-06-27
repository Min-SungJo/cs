package org.example.programmers.java.level0;

public class 유한소수_판별하기 {
    public static void main(String[] args) {
        int a = 12;
        int b = 21;
        System.out.println(solution(a, b));
    }

    private static int solution(int a, int b) {
        // 1000 이하에 존재하는 2와 5의 소인수를 구한다
        int limit = 1000;
        int n2 = 1;
        double n2cnt = 0;
        int n5 = 1;
        double n5cnt = 0;
        while (n2 < limit) {// 2~512 까지 9개 존재
            n2 *= 2;
            n2cnt++;
        }
        while (n5 < limit) {// 5~625 까지 4개 존재
            n5 *= 5;
            n5cnt++;
        }
        double n = Math.pow(2, n2cnt - 1) * Math.pow(5, n5cnt - 1); // (2^9)*(5^4)
        int answer = ((a * n) % b == 0) ? 1 : 2; // 유한 소수라면 나머지가 0임
        return answer;
    }
//        int gcd = getGcd(a, b);
//        b/=gcd;
//        for (int i = 2; i <= b; i++) {
//            while (b % i == 0) {
//                if(i!=2&&i!=5) {
//                    return 2;
//                }
//                b /= i;
//            }
//        }
//        return 1;
//    }
//
//    private static int getGcd(int a, int b) {
//        if (b == 0) return a;
//        return getGcd(b, a % b);
//    }
}