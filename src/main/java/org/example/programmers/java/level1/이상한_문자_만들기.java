package org.example.programmers.java.level1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        StringBuilder temp = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c==' ') {
                sb.append(temp).append(' ');
                temp.setLength(0);
                idx = 0;
                continue;
            } else if(idx%2==0) {
                c = (char)(c%'a'%'A'+'A');
            } else {
                c = (char)(c%'a'%'A'+'a');
            }
            temp.append(c);
            idx++;
        }
        sb.append(temp);
        return sb.toString();
    }

}