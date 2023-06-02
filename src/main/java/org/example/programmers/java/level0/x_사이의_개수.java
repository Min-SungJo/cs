package org.example.programmers.java.level0;

public class x_사이의_개수 {
    public static void main(String[] args) {
        String myString = "ooxoxxox";
        System.out.println(solution(myString));
    }

    private static int[] solution(String myString) {
        String[] strArr = myString.split("x");
        int len = strArr.length;
        if(myString.charAt(myString.length()-1)=='x') len++;
        int[] arr = new int[len];
        for(int i = 0; i < strArr.length; i++) {
            arr[i] = strArr[i].length();
        }
        return arr;
    }
}