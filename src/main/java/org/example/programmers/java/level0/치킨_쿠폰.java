package org.example.programmers.java.level0;


public class 치킨_쿠폰 {
    public static void main(String[] args) {
//        int chicken = 100;
        int chicken = 1081;
        System.out.println(solution(chicken));
    }

    private static int solution(int chicken) {
//        int sum = 0;
//        int ratio = 10;
//        int coupon = chicken / ratio;
//        sum += coupon;
//        coupon += chicken % ratio;
//        while (coupon >= ratio) {
//            sum += coupon / ratio;
//            coupon = (coupon % ratio) + (coupon / ratio);
//        }
//        return sum;
        int answer = chicken/9;
        if(chicken>1&&chicken%9==0){
            answer--;
        }
        return answer;
    }

}