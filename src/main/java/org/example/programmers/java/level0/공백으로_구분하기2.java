package org.example.programmers.java.level0;

public class 공백으로_구분하기2 {
    public static void main(String[] args) {
        String my_string = " i    love  you";
        System.out.println(solution(my_string));
    }

    private static String[] solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        sb.append(arr[0]);
        for(int i = 1; i <arr.length; i ++) {
            if(arr[i-1]!=' '||arr[i]!=' '){
                sb.append(arr[i]);
            }
        }
        if(sb.charAt(0)==' '){
            sb.deleteCharAt(0);
        }
//        my_string.trim().split("[ ]+"); trim()으로 앞 뒤 공백 제거, 정규식으로 하나 이상의 공백을 기준으로 배열을 생성
        return sb.toString().split(" ");
    }
}