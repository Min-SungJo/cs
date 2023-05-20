package org.example.programmers.java.level0;

public class 조건에_맞게_수열_변환하기3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 100, 99, 98};
        int k = 1;
        int[] result = solution(arr, k);
        System.out.println(result);
    }

    private static int[] solution(int[] arr, int k) {
        if(k%2==1){
            for(int i = 0; i< arr.length; i++) {
                arr[i]*=k;
            }
        } else{
            for(int i = 0; i< arr.length; i++) {
                arr[i] += k;
            }
        }
        return arr;
    }

}