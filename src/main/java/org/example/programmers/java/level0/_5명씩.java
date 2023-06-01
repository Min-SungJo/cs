package org.example.programmers.java.level0;

public class _5명씩 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        System.out.println(solution(names));
    }

    private static String[] solution(String[] names) {
        int len = names.length;
        int count = (len%5==0)? len/5 :len/5+1;
        String[] arr = new String[count];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = names[idx];
            idx+=5;
        }
        return arr;
    }
}