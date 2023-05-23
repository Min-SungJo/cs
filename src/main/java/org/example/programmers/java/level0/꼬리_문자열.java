package org.example.programmers.java.level0;

public class 꼬리_문자열 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(solution(str_list,ex));
    }

    private static String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();
        for(String str : str_list) {
            if(str.indexOf(ex)==-1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}