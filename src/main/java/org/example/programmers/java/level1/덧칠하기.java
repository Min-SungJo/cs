package org.example.programmers.java.level1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class 덧칠하기 {

    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};
        System.out.println(solution(n, m, section));
    }

    public static int solution(int n, int m, int[] section) {
        int start = section[0];
        int end = section[0] + (m - 1);
        int ans = 1;

        for (int i : section) {
            if (i >= start && i <= end)
                continue;
            else {
                start = i;
                end = i + (m - 1);
                ans++;
            }

        }
        return ans;
    }
}
