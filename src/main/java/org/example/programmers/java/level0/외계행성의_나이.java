package org.example.programmers.java.level0;

public class 외계행성의_나이 {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    private static String solution(int age) {
        //a 0, b 1 아스키 코드로 변환하고, 변수에 담아서 반환
        // while 문을 통해 age의 1의 자릿수를 선정
        // StringBuilder에 큐 구조로 추가하여 반환
        StringBuilder sb = new StringBuilder();
        char c = ' ';
        while(age>0) {
            c=(char)(age%10 + 'a');
            sb.insert(0,c);
            age/=10;
        }
        return sb.toString();
    }
}