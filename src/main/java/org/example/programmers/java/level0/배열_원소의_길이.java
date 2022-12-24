package org.example.programmers.java.level0;

public class 배열_원소의_길이 {
    public static void main(String[] args) {

        String[] strlist = {"hello","world","!"};
        System.out.println(solution(strlist));
    }

    private static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int index=0;
        for(String i : strlist){
            answer[index++]=i.length();
        }
        return answer;
    }
}