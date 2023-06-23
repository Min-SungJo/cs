package org.example.programmers.java.level0;

import java.util.HashMap;

public class 로그인_성공 {
    public static void main(String[] args) {

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));
    }

    private static String solution(String[] id_pw, String[][] db) {

        String id = id_pw[0];
        String pw = id_pw[1];
//        for (int i = 0; i < db.length; i++) {
//            if (db[i][0].equals(id)) {
//                if (db[i][1].equals(pw)) {
//                    return "login";
//                } else {
//                    return "wrong pw";
//                }
//            }
//        }

        HashMap<String, String> map = new HashMap<>();
        for(String[] arr : db) {
            map.put(arr[0],arr[1]);
        }
        for(int i = 0; i < map.size(); i++) {
            String temp = map.get(id);
            if(temp==null) return "fail";
            if(!temp.equals(pw)) return "wrong pw";
        }
        return "login";
    }
}