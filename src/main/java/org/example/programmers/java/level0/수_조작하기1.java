package org.example.programmers.java.level0;

public class 수_조작하기1 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        int result = solution(n, control);
        System.out.println(result);
    }

    private static int solution(int n, String control) {
        char[] arr = control.toCharArray();
        for(char c : arr) {
            if (c == 'w') {
                ++n;
            } else if (c == 's') {
                --n;
            } else if (c == 'd') {
                n+=10;
            } else {
                n-=10;
            }
        }
        return n;
    }
}