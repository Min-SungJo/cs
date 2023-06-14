package org.example.programmers.java.level1;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
//        int substringIdx = phone_number.length()-4;
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < substringIdx; i++) {
//            sb.append("*");
//        }
//        sb.append(phone_number.substring(substringIdx));
//        return sb.toString();
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}