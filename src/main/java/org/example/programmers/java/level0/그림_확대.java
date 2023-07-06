package org.example.programmers.java.level0;

public class 그림_확대 {
    public static void main(String[] args) {
        String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k = 8;
        System.out.println(solution(picture, k));
    }

    private static String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb = new StringBuilder();

        int idx = 0;
        for (int i = 0; i < picture.length; i ++) {
            String str = picture[i]; // 배열에 있는 문자열 선택
            // 그 문자열의 각 요소를 k 번 만큼 반복하여 변수에 저장
            // 저장한 변수를 리스트에 대입
            for(int j = 0; j < str.length(); j++) {
                sb.append(str.substring(j,j+1).repeat(k));
            }
            for(int q = 0; q < k; q++){
                answer[idx++] = sb.toString();
            }
            sb.setLength(0);
        }
        return answer;
    }
}