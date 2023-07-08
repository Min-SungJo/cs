package org.example.programmers.java.level1;

public class 크기가_작은_부분_문자열 {

    public static void main(String[] args) {
        String t = "3141592";
        String p = "500220839878";
        System.out.print(solution(t, p));
    }

    public static int solution(String t, String p) {
        int lenP = p.length();
        int lenT = t.length() - lenP + 1;
        int sum = 0;
        for(int i = 0; i < lenT; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < lenP; j++) {
                sb.append(t.charAt(i+j));
            }
            System.out.println(sb);

            if(Long.parseLong(sb.toString())<=Long.parseLong(p)) {
                sum++;
            }
        }
        return sum;
    }
}
