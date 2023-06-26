package org.example.programmers.java.level0;

import java.util.Arrays;

public class 외계어_사전 {
    public static void main(String[] args) {
        String[] spell = {"z", "d", "x"};
        String[] dic = {"def", "dww", "dzx", "loveaw"};
        System.out.println(solution(spell, dic));
    }

    private static int solution(String[] spell, String[] dic) {
        int check;
        Arrays.sort(spell);
        for (String str : dic) {
            check = spell.length;
            if (!(str.length() == spell.length)) continue;
            String[] arr = str.split("");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(spell[i])) {
                    check -= 1;
                    if (check == 0) return 1;
                } else {
                    break;
                }
            }
        }
        return 2;
    }
}