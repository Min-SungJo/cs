package org.example.programmers.java.level0;

public class 왼쪽_오른쪽 {
    public static void main(String[] args) {
        String[] str_list = {"u", "u", "d"};
//        String[] str_list = {"r", "l","r", "r", "r"};
        System.out.println(solution(str_list));
    }

    private static String[] solution(String[] str_list) {
        int len = str_list.length;
        boolean isContain = false;
        int start = 0;
        int end = len;
        for (int i = 0; i < len; i++) {
            if (str_list[i].equals("l")) {
                end = i;
                isContain = true;
                break;
            } else if (str_list[i].equals("r")) {
                start = i + 1;
                isContain = true;
                break;
            }
        }
        if (len == 0 || !isContain) return new String[]{};
        String[] answer = new String[end - start];
        int idx = 0;
        for (int i = start; i < end; i++) {
            answer[idx++] = str_list[i];
        }
        return answer;
    }
}