package org.example.programmers.java.level0;

public class 이진수_더하기 {
    public static void main(String[] args) {
        String bin1 = "1001";
        String bin2 = "1111";
        System.out.println(solution(bin1, bin2));
    }

    private static String solution(String bin1, String bin2) {
        int intBin1 = Integer.parseInt(bin1,2);
        int intBin2 = Integer.parseInt(bin2,2);
        String answer = Integer.toBinaryString(intBin1+intBin2);
        return answer;
    }
}