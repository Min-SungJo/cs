package org.example.programmers.java.level0;

public class 문자열_바꿔서_찾기 {
    public static void main(String[] args) {
        String my_string = "ABBAA";
        String pat = "AABB";
        System.out.println(solution(my_string,pat));
    }

    private static int solution(String my_string, String pat) {
        StringBuilder sb = new StringBuilder();
        for(char c : pat.toCharArray()) {
            sb.append((c=='A')?'B':'A');
        }
        return my_string.contains(sb)?1:0;
    }
}