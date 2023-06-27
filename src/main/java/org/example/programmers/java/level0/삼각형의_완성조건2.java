package org.example.programmers.java.level0;

public class 삼각형의_완성조건2 {
    public static void main(String[] args) {

        int[] sides = {11, 7};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        //가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
        //나머지 한 변이 될 수 있는 정수의 개수를 return
        int maxNumInArray = Math.max(sides[0], sides[1]);
        int minNumInArray = Math.min(sides[0], sides[1]);
        int sum = 0;
        // maxNumInArray 이 가장 긴 변일 경우, 두 번째로 긴 변일 경우
//        sum+= Math.abs(maxNumInArray-maxNumInArray-minNumInArray);
//        sum+=minNumInArray;
//        sum+=minNumInArray+maxNumInArray-maxNumInArray-1;
//        sum+=minNumInArray-1;
        sum+=minNumInArray*2-1;
        return sum;

    }
}