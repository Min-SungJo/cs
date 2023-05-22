package org.example.programmers.java.level0;

public class 문자열_정수의_합 {
    public static void main(String[] args) {
        String num_str = "123456789";
        int result = solution(num_str);
        System.out.println(result);
    }
    private static int solution(String num_str) {
        int sum = 0;
        for (char c : num_str.toCharArray()) {
            if(c!='0'){
                sum+=(c-48);
            }
        }
        return sum;
    }
}