package org.example.programmers.java.level0;

public class 옹알이1 {
    public static void main(String[] args) {

        String[] babbling = {"ayaye", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        // "aya", "ye", "woo", "ma" 를 붙여서 만든 원소가 있으면 ++
        // replaceFirst 를 사용하여 공백으로 변환,
        // for 문을 사용하여 리스트의 원소가 비어 있는 경우 ++
        String[] arr = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            for(String str : arr) {
                babbling[i] = babbling[i].replaceFirst(str,"0");
            }
        }
        for(String str : babbling) {
            str = str.replace("0","");
            if(str.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}