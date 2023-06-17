package org.example.programmers.java.level1;

public class 서울에서_김서방_찾기 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution(seoul));
    }

    public static String solution(String[] seoul) {
        int length = seoul.length;
        int idx = 0;
        for(int i = 0; i < length; i++) {
            if(seoul[i].equals("Kim")) {
                idx = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        sb.append(idx);
        sb.append("에 있다");
        return sb.toString();
    }
}
