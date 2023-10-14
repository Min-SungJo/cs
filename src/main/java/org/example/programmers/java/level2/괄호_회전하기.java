package org.example.programmers.java.level2;

import java.util.*;

public class 괄호_회전하기 {
    public static void main(String[] args) {
        String s = "}]()[{";
        System.out.println(solution(s));
    }

    public static boolean isOddLength(String s) {
        return s.length() % 2 == 1;
    }

    public static void rotation(Deque<Character> deque) {
        char temp;
        temp = deque.getFirst();
        deque.removeFirst();
        deque.addLast(temp);
    }

    static Map<Character, Character> map = Map.of(
            '{', '}',
            '[', ']',
            '(', ')'
    );

    public static boolean checkBrackets(Deque<Character> deque) {
        Stack<Character> stk = new Stack<>();
        int idx;
        for (char c : deque) {
            idx = stk.size() - 1;
            if (idx == -1 && !map.containsKey(c)) return false; // 처음부터 성립할 수 없는 괄호인가?
            if (idx == -1) stk.push(c); // stack 이 비어있다면 일단 넣기
            else if (map.containsKey(stk.get(idx)) && (map.get(stk.get(idx))) == c)
                stk.setSize(idx); // stack 이 비어있지 않고, 괄호가 올바르다면 스택에 데이터를 추가하지 않고 스택에서 마지막 데이터 제거
            else stk.push(c); // 그 외의 조건이라면 stack 에 넣기
        }
        return stk.empty();
    }

    public static int solution(String s) {
        int answer = 0;
        if (isOddLength(s)) return answer;
        // 데크 구조 사용 하여 문자를 저장하고,
        // 조건문을 통해 유효성을 검사 -> (스택을 활용)
        // 문자열의 길이만큼 반복,
        // 문자열의 길이가 홀수라면 0을 반환
        Deque<Character> deque = new ArrayDeque<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            deque.add(s.charAt(i));
        }

        for (int i = 0; i < len; i++) {
            if (checkBrackets(deque)) answer++; // 괄호가 올바른가?
            rotation(deque); // 괄호 밀기
        }
        return answer;
    }
}
