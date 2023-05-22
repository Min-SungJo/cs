package org.example.programmers.java.level1;
public class 부족한_금액_계산하기 {

	public static void main(String[] args) {
		System.out.print(solution(3, 20, 4));
	}
    public static long solution(int price, int money, int count) {
    	long answer = 0;
    	long sum=0;
    	for(int i=1;i<=count;i++) {
    		sum+=price*i;
    	}
    	if(money>sum) answer=0;
    	else answer=sum-money;
        return answer;
    }
}
