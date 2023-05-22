package org.example.programmers.java.level0;

public class 이어_붙인_수 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int result = solution(num_list);
        System.out.println(result);
    }

    private static int solution(int[] num_list) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for(int i : num_list) {
            if (i%2==1) {
                odd.append(i);
            } else {
                even.append(i);
            }
        }
        return Integer.parseInt(odd.toString())+Integer.parseInt(even.toString());
    }
}