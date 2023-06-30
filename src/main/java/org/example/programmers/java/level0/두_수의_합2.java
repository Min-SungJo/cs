package org.example.programmers.java.level0;

import java.math.BigInteger;

public class 두_수의_합2 {
    public static void main(String[] args) {
        String a = "09551615";
        String b = "70928366";
        // 80479981
        System.out.println(solution(a, b));
    }

    private static String solution(String a, String b) {
//        BigInteger bigA = new BigInteger(a);
//        BigInteger bigB = new BigInteger(b);
//        return bigA.add(bigB).toString();
        int aLen = a.length();
        int bLen = b.length();
        int[] arr = new int[Math.max(aLen, bLen) + 1];
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int aNum = 0;
            int bNum = 0;
            if (aLen > i) {
                aNum = a.charAt(aLen - i - 1) - '0';
            }
            if (bLen > i) {
                bNum = b.charAt(bLen - i - 1) - '0';
            }
            int sum = aNum + bNum;
            arr[i + 1] += (arr[i]+sum) / 10;
            arr[i] = (arr[i]+sum) % 10;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int num = arr[len - i - 1];
            sb.append(num);
        }
        if(sb.charAt(0)=='0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}