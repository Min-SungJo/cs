package org.example.programmers.java.level1;
public class 문자열_나누기 {

	public static void main(String[] args) {
		System.out.print(solution("aaabbaccccabba"));
	}
    public static int solution(String s) {
        int answer = 0;
        int cntX = 0, cntY = 0;
        char x = s.charAt(0);
       	for(int i =0; i<s.length();i++) {
        	if (x==s.charAt(i)) {
        		cntX++;
	       	}else {
	       		cntY++;
	       	}
	       	if(i+1==s.length()) {
	       		answer++;
	       		break;
	       	}
	       	if(cntX==cntY) {
	       		cntX=0;
	       		cntY=0;
	       		x = s.charAt(i+1);
	       		answer++;
	       	}
       	}
        return answer;
    }
}
