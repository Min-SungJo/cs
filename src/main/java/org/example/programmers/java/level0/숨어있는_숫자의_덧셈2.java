package org.example.programmers.java.level0;

public class 숨어있는_숫자의_덧셈2 {
    public static void main(String[] args) {
        String my_string = "ap";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        String[] arr = my_string.replaceAll("[^0-9]+"," ").trim().split(" ");
        int sum = 0;
        if(arr[0].equals("")) return 0;
        for(String str : arr) {
            sum+= Integer.parseInt(str);
        }
        return sum;
    }
}