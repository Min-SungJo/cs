package org.example.programmers.java.level0;

import java.util.Map;
import java.util.function.BiFunction;

public class 조건_문자열 {
    public static void main(String[] args) {

        String ineq = "<";
        String eq = "=";
        int n = 20;
        int m = 50;
        System.out.println(solution(ineq, eq, n, m));
    }

    private static int solution(String ineq, String eq, int n, int m) {
        boolean check;
        if (ineq.equals(">")) {
            check = n > m;
        } else {
            check = n < m;
        }
        if (!check && eq.equals("=")) {
            check = n == m;
        }
        return check ? 1 : 0;
//        Map<String, BiFunction<Integer, Integer, Boolean>> functionMap = Map.of(
//                ">=", (a, b) -> a >= b,
//                "<=", (a, b) -> a <= b,
//                ">!", (a, b) -> a > b,
//                "<!", (a, b) -> a < b
//        );
//        StringBuilder sb = new StringBuilder();
//        sb.append(ineq).append(eq);
//        check = functionMap.get(sb.toString()).apply(n,m);
//        return check?1:0;
    }

}