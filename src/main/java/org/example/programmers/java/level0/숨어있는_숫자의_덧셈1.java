package org.example.programmers.java.level0;

public class 숨어있는_숫자의_덧셈1 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int result = solution(my_string);
        System.out.println(result);
    }

    private static int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            try {
                sum += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            } catch (NumberFormatException e) {
            }
        }
        return sum;
    }
}