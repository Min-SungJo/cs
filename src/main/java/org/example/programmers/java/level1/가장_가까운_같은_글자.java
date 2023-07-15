package org.example.programmers.java.level1;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        String s = "ss";
        System.out.println(solution(s));
    }

    public static int[] solution(String s) {
        char[] list = s.toCharArray();
        int[] answer = new int[list.length];
        for (int i = answer.length - 1; i >= 0; i--) {
            char c = list[i];
            int idx = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (c == list[j]) {
                    idx = i - j;
                    break;
                }
            }
            answer[i] = idx;
        }

//        int[] answer = new int[s.length()];
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0; i<s.length();i++){
//            char ch = s.charAt(i);
//            answer[i] = i-map.getOrDefault(ch,i+1);
//            map.put(ch,i);
//        }
        return answer;
    }
}