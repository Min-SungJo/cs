package org.example.programmers.java.level0;

public class 문자열_밀기 {
    public static void main(String[] args) {
        String A = "hello";
        String B = "lohel";
        System.out.println(solution(A, B));
    }

    private static int solution(String A, String B) {
//        if(A.equals(B)) return 0;
//        StringBuilder sb = new StringBuilder();
//        int length = A.length();
//        for(int i = 0; i < length; i++) {
//            sb.append(A.charAt(length-1));
//            sb.append(A,0,length-1);
//            A = sb.toString();
//            if(A.equals(B)) {
//                return i+1;
//            }
//            sb.setLength(0);
//        }
//        return -1;
        StringBuilder sb = new StringBuilder();
        sb.append(B.repeat(2));
        return sb.indexOf(A);
    }
}