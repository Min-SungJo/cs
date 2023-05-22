package org.example.algorithmDataStructure;

import java.util.Scanner;

/**
 * repeat 은 String 클래스에 있는 인스턴스 메서드임
 * 문자열.repeat(숫자)
 * 문자열을 숫자만큼 반복하여 생성, 반환
 * */
public class Repeat {
    /**
     "*" 을 n개 출력, w개 마다 줄바꿈
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n값: ");
        int n = scan.nextInt();
        System.out.print("w값: ");
        int w = scan.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if ((i + 1) % w == 0) {
                System.out.println();
            }

        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < n / w; i++) {
            System.out.println("*".repeat(w));
        }

        int rest = n % w;
        if (rest != 0) {
            System.out.println("*".repeat(rest));
        }
    }
}
