package org.example.programmers.java.level0;

public class 가위_바위_보 {
    public static void main(String[] args) {
        String rsp = "205";
        String result = solution(rsp);
        System.out.println(result);
    }

    private static String solution(String rsp) {
        char[] arr = rsp.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            if (c == '0'){
                sb.append("5");
            } else if (c == '2'){
                sb.append("0");
            } else {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}