package org.example.programmers.java.level0;

public class 조건에_맞게_수열_변환하기1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};
        int[] result = solution(arr);
        System.out.println(result);
    }

    private static int[] solution(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>=50&&arr[i]%2==0){
                arr[i]/=2;
            } else if (arr[i]<50&&arr[i]%2==1) {
                arr[i]*=2;
            }
        }
        return arr;
    }

}