
package org.example.programmers.java.level0;

import java.util.HashMap;

public class 문자열_묶기 {
    public static void main(String[] args) {
        String[] strArr = {"a", "bc", "d", "efg", "hi"};
        System.out.println(solution(strArr));
    }

    private static int solution(String[] strArr) {
        // 같은 길이를 가진 문자열끼리 그룹으로 묶고, 그 중에서 가장 개수가 많은 그룹의 크기를 반환
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            int lenCnt = map.getOrDefault(len, 0) + 1;
            map.put(len, lenCnt);
        }
        int max = 0;
        for (int i : map.values()) {
            max = max > i ? max : i;
        }
        return max;
    }
}