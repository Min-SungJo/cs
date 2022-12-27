package org.example.programmers.java.level0;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {
        int num = 50;
        System.out.println(solution(num));
    }

    private static int solution(int price) {
        if (price>=500000){
            price*=.8;
        } else if(price>=300000){
            price*=.9;
        } else if(price>=100000){
            price*=.95;
        }
        int answer = price;
        return answer;
    }
}