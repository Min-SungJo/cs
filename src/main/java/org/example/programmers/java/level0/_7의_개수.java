package org.example.programmers.java.level0;

public class _7의_개수 {
    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i : array) {
            sb.append(i);
        }
        String sevenStr = sb.toString().replaceAll("[^7]","");
        return sevenStr.length();
    }
}