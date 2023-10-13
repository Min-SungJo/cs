package org.example.programmers.java.level2;

import java.util.HashSet;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        int n = 2;
        String[] words = {"tank", "kick", "kick", "know"};
        System.out.println(solution(n, words));
    }
    static HashSet<String> set = new HashSet<>();
    public static int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        // n 은 2이상 10 이하의 자연수, 끝말잇기에 참여하는 사람 수
        // words 는 끝말잇기에 사용된 단어 순서대로
        // {틀린사람, 자신의 답 중 몇번째에서 틀렸는지}
        // 단어를 비교하는 메서드를 만들고, 인덱스를 나누어 그 나머지를 반환
        // 추가로 기존에 사용된 단어를 저장하는 자료형을 만들기
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (isUsed(words[i]) || !isSame(words[i - 1], words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            set.add(words[i]);
        }
        return answer;
    }

    static boolean isSame(String a, String b) {
        return a.charAt(a.length() - 1) == b.charAt(0);
    }
    static boolean isUsed(String s) {
        return !set.isEmpty() && set.contains(s);
    }
}
