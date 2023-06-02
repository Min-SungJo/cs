package org.example.programmers.java.level0;

import java.util.ArrayList;

public class ad_제거하기 {
    public static void main(String[] args) {
        String[] strArr = {"and","notad","abcd"};
        System.out.println(solution(strArr));
    }

    private static String[] solution(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(String str : strArr) {
            if(!str.contains("ad")) {
                arrayList.add(str);
            }
        }
        int len = arrayList.size();
        String[] answer = new String[len];
        for(int i = 0; i < len; i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}