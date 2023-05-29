package org.example.programmers.java.level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 최빈값_구하기 {
    public static void main(String[] args) {
        int[] array = {2};
        int result = solution(array);
        System.out.println(result);
    }

    private static int solution(int[] array) {
        Arrays.sort(array);

        int key = array[0];
        int count = 1;
        int mode = array[0];
        int modeCount = 1;
        boolean change = false;
        if (array.length == 1) {
            return key;
        }
        for(int i =1; i < array.length; i++) {
            if(array[i]==key) {
                count++;
                if(count ==modeCount) {
                    mode = -1;
                } else if (count > modeCount) {
                    change = true;
                    modeCount = count;
                    mode = key;
                }
            } else{
                count = 1;
                key = array[i];
            }
        }
        return change?mode:-1;
    }
}