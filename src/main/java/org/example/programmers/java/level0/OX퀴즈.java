package org.example.programmers.java.level0;


public class OX퀴즈 {
    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(solution(quiz));
    }

    private static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] q = quiz[i].split(" ");
            int sum = 0;
            int x = Integer.parseInt(q[0]);
            String opt = q[1];
            int y = Integer.parseInt(q[2]);
            int z = Integer.parseInt(q[4]);
            if (opt.equals("+")) {
                sum = x + y;
            } else {
                sum = x - y;
            }
            answer[i]=(sum==z)?"O":"X";
        }
        return answer;
    }

}