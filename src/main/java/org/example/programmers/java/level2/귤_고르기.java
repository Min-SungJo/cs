package org.example.programmers.java.level2;

import java.util.Arrays;
import java.util.HashMap;

public class 귤_고르기 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution(k, tangerine));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        // k 개의 귤 담기
        // 서로 담으려는 종류의 수를 최소화
        // 최소로 담은 귤의 종류
        // hashMap 을 사용하여 종류별 개수를 저장, 가장 높은 value 가 k 이상이 될 때까지 내림차순으로 map value 더하기
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tangerine.length; i++) {
            int num = tangerine[i];
            int cnt = map.getOrDefault(num, 0) + 1;
            map.put(num, cnt);
        }
        int[] arr = new int[map.size()];
        int idx = 0;
        for(int i : map.values()) {
            arr[idx++] = i;
        }
        Arrays.sort(arr);
        int sum = 0;
        int idx2 = arr.length-1;
        while(sum < k) {
            sum+=arr[idx2--];
            answer++;
        }
        return answer;
    }
}
