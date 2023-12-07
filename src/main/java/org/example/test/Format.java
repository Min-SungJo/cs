package org.example.test;

public class Format {
    public static void main(String[] args) {
        String str = "100000000";
        format(str);
    }

    private static void format(String str) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            sb.append(str.charAt(len - 1 - i));
            if ((i + 1) % 3 == 0
                    && (i+1) != len) {
                sb.append(',');
            }
        }

        sb.reverse();

        System.out.println(sb);
    }
}
