package org.example.programmers.java.level1;

public class 옹알이2 {
    public static void main(String[] args) {

        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        // "aya", "ye", "woo", "ma" 를 붙여서 만든 원소가 있으면 ++
        // replaceFirst 를 사용하여 공백으로 변환,
        // for 문을 사용하여 리스트의 원소가 비어 있는 경우 ++
        int answer = 0;

        String[] possible = {"aya", "ye", "woo", "ma"};
        String[] impossible = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String element : babbling) {
            for (String check : impossible) {
                element = element.replace(check, "X");
            }
            for (String check : possible) {
                element = element.replace(check, "O");
            }

            int check = 0;
            for (int i = 0; i < element.length(); i++) {
                if (element.charAt(i) != 'O') {
                    check++;
                    break;
                }
            }
            if (check == 0) answer++;
        }

        return answer;
    }
}