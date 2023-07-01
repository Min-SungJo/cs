package org.example.programmers.java.level0;

import java.util.LinkedHashMap;

public class 주사위_게임3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        int c = 2;
        int d = 5;
        int result = solution(a, b, c, d);
        System.out.println(result);
    }

    private static int solution(int a, int b, int c, int d) {
        // map 으로 저장
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] arr = {a, b, c, d};
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int num = arr[i];
            int cnt = map.getOrDefault(num, 0) + 1;
            map.put(num, cnt);
        }
        int sum = 0;
        int size = map.size();

        if (size == 1) { // 모두 p로 같다면 1111 × p
            int p = arr[0];
            sum = (1111 * p);
        }
        if (size == 2 && (map.get(arr[0]) == 1 || map.get(arr[0]) == 3)) { // 세 주사위에서 나온 숫자가 p (10 × p + q)2
            int p = 0;
            int q = 0;
            for (int i = 0; i < len; i++) {
                int key = arr[i];
                int value = map.get(key);
                if (value == 3) {
                    p = key;
                } else {
                    q = key;
                }
            }
            sum = (10 * p + q) * (10 * p + q);
        }
        if (size == 2 && map.get(arr[0]) == 2) { // 주사위가 두 개씩 같은 값 (p + q) × |p - q|
            int p = arr[0]; // 일단 첫 번째 값을 설정
            int q = 0;
            for (int i = 1; i < len; i++) {
                int key = arr[i];
                if (key != p) { // map 에 담긴 값이, 앞서 설정한 p와 다르면 q에 입력
                    q = key;
                    break;
                }
            }
            sum = (p + q) * (Math.abs(p - q));
        }
        if (size == 3) { // 어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다름 q × r점을 얻습니다.
            int q = 0;
            int r = 0;
            for (int i : arr) {
                if (map.get(i) == 1 && !map.containsKey(q)) {
                    q = i;
                } else if (map.get(i) == 1 && map.containsKey(q)) {
                    r = i;
                }
            }
            sum = q * r;
        }
        if (size == 4) { // 네 주사위에 적힌 숫자가 모두 다르다면 작은 숫자 만큼의 점수를 얻습니다.
            int min = arr[0];
            for (int i = 1; i < len; i++) {
                min = Math.min(arr[i], min);
            }
            sum = min;
        }
        return sum;
    }
}