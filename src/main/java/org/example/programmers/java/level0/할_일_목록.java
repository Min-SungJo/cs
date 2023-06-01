package org.example.programmers.java.level0;

public class 할_일_목록 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(solution(todo_list, finished));
    }

    private static String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        for(boolean b : finished) {
            if(!b) {
                len++;
            }
        }
        String[] arr = new String[len];
        int idx = 0;
        for(int i = 0; i < todo_list.length; i ++) {
            if(!finished[i]) {
                arr[idx++] = todo_list[i];
            }
        }
        return arr;
    }
}