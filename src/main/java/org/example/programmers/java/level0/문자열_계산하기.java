package org.example.programmers.java.level0;

public class 문자열_계산하기 {
    public static void main(String[] args) {
        String my_string = "3 + 4";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        String[] arr = my_string.split(" ");
        int sum = Integer.parseInt(arr[0]);
        String operator;
        for(int i = 2; i < arr.length; i+=2) {
            operator = arr[i];
            int num = Integer.parseInt(arr[i]);
            sum=operator.equals("+")?sum+num:sum-num;
        }
        return sum;
    }
}