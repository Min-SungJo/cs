package org.example.programmers.java.level0;

public class 문자_개수_세기 {
    public static void main(String[] args) {
        String my_string = "Programmers";
        System.out.println(solution(my_string));
    }

    private static int[] solution(String my_string) {
        int[] arr = new int[52];
        char[] chars = my_string.toCharArray();
        for(char c : chars) {
            int idx = c<=90?c-'A':c-'a'+26;
            arr[idx]++;
        }
        return arr;
    }
}