package org.example.programmers.java.level0;

public class 글자_이어_붙여_문자열_만들기 {
    public static void main(String[] args) {
        String my_string = "cvsgiorszzzmrpaqpe";
        int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        String result = solution(my_string, index_list);
        System.out.println(result);
    }

    private static String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        for(int i = 0; i < index_list.length; i++) {
            sb.append(arr[index_list[i]]);
        }
        return sb.toString();
    }
}