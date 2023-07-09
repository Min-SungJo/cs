package org.example.programmers.java.level1;

public class 비밀지도 {

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 1, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(solution(n, arr1, arr2));
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] field = new String[n];
        for(int i = 0 ; i< field.length; i++) {
            String binaryString = Integer.toBinaryString(arr1[i]|arr2[i]);
            StringBuilder sb = new StringBuilder();
            int len = binaryString.length();
            sb.append("0".repeat(n-len)).append(binaryString);
            StringBuilder line = new StringBuilder();
            for(int j = 0; j < sb.length(); j++) {
                char c = ' ';
                if(sb.charAt(j)=='1') {
                    c = '#';
                }
                line.append(c);
            }
            field[i] = line.toString();
        }
        return field;
    }
}
