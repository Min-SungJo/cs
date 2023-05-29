package org.example.programmers.java.level0;

import java.util.HashMap;
import java.util.Map;

public class 최빈값_구하기 {
    public static void main(String[] args) {
        int[] array = {1};
        int result = solution(array);
        System.out.println(result);
    }

    public static int solution(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        int mode = array[0];
        int modeCount = 0;
        for(int number : array) {
            int count = map.getOrDefault(number,0)+1;
            System.out.println(count);
            System.out.println(modeCount);
            if(count > modeCount) {
                mode = number;
                modeCount = count;
            } else if (count == modeCount) {
                mode = -1;
            }
            map.put(number,count);
        }
        return mode;
    }
}
