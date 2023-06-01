package org.example.programmers.java.level1;

import java.util.HashMap;

public class 완주하지_못한_선수 {

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : participant) {
            int count = map.getOrDefault(str,0)+1;
            map.put(str,count);
        }
        for(String com : completion) {
            int count = map.get(com);
            map.put(com,count-1);
        }
        for(String peo : map.keySet()) {
            if(map.get(peo)==1){
                return peo;
            }
        }
        return "";
    }
}
