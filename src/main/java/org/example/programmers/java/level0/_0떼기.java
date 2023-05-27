package org.example.programmers.java.level0;

public class _0떼기 {
    public static void main(String[] args) {
        String n_str = "0010";
        System.out.println(solution(n_str));
    }

    private static String solution(String n_str) {
        // 내장 함수를 사용하여 문자열 변환
        // 0이 처음으로 등장하면,
        // 그 0부터 연속된 0을, 제거
//        return (n_str.charAt(0) == '0')?n_str.replaceFirst("0+", ""):n_str;
        //앞에 등장하는 0을 제거하기 위해, 정수형으로 변환 후에 다시 문자열로 변환하여 반환
        StringBuilder sb =new StringBuilder();
        sb.append(Integer.parseInt(n_str));
        return sb.toString();
    }
}