package org.example.programmers.java.level1;

public class 실패율 {

    public static void main(String[] args) {
//        int N = 5;
        int N = 2;
//        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3}; // 3,4,2,1,5
        int[] stages = {1,1,1,1};
        System.out.println(solution(N, stages));
    }

    public static int[] solution(int N, int[] stages) {
        //변수에 담을 값
        // 각 스테이지별 머물러 있는 사람
        // 각 스테이지, 실패율
        double[] fail = new double[N];
        int peoSum = 0;
        int[] answer = new int[N];
        int[] peoInStage = new int[N + 1];
        for (int i : stages) {
            peoInStage[i - 1]++;
        }
        peoSum = peoInStage[peoInStage.length - 1];
        for (int i = 1; i < peoInStage.length; i++) {
            int idx = peoInStage.length - 1 - i;
            int now = peoInStage[idx];
            peoSum += now;
            double num = peoSum!=0?(double)now/peoSum:0;
            fail[idx] = num;
        }
        for (int i = 0; i < answer.length; i++) {
            int stageMax = -1;
            double failMax = -1.0;
            for (int j = 0; j < fail.length; j++) {
                if(failMax < fail[j]) {
                    failMax = fail[j];
                    stageMax = j;
                }
            }
            fail[stageMax] = -1;
            answer[i] = stageMax+1;
        }
        return answer;
    }
}
