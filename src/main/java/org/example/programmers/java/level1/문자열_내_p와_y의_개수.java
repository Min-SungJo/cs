package org.example.programmers.java.level1;
public class 문자열_내_p와_y의_개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		System.out.print(solution(s));
	}
    public static boolean solution(String s) {
		int cntP = 0;
		int cntY = 0;
		for(char c : s.toCharArray()) {
			if (c=='p'||c=='P') {
				cntP++;
			} else if(c=='y'||c=='Y') {
				cntY++;
			}
		}
        return cntP==cntY;
    }
}
