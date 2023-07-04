package org.example.programmers.java.level0;

public class qr_code {
    public static void main(String[] args) {

        int q = 3;
        int r = 1;
        String code = "qjnwezgrpirldywt";
        String result = solution(q, r, code);
        System.out.println(result);
    }

    private static String solution(int q, int r, String code) {
        int len = code.length();
        StringBuilder sb =new StringBuilder();
        for(int i = r; i < len; i+= q) {
            int num = i%q;
            if(num == r) sb.append(code.charAt(i));
        }
        return sb.toString();
    }
}