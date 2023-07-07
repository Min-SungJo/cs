package org.example.programmers.java.level1;

import java.util.*;

public class 신고_결과_받기 {

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] id_list = {"abc", "acd", "add", "abd"};
//        String[] id_list = {"con", "ryan"};
//        String[] report = {"abc abd", "abc add", "acd abd", "abc abd", "add abd"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        System.out.println(solution(id_list, report, k));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> map = report(report);
        LinkedHashMap<String, Integer> mailMap = setSendMail(id_list, map, k);
        int[] list = new int[id_list.length];
        int idx = 0;
        for(int cnt :mailMap.values()) {
            list[idx++] = cnt;
        }
        return list;
    }
    private static LinkedHashMap<String, Integer> setSendMail(String[] id_list, HashMap<String, HashSet<String>> map, int k) {
        LinkedHashMap<String, Integer> mailMap = new LinkedHashMap<>();
        // 신고
        for (int i = 0; i < id_list.length; i++) {
            mailMap.put(id_list[i], 0);
        }
        // 신고 내용을 유저별로 취합한다
        for (String reportId : id_list) {
            int reportCnt = map.getOrDefault(reportId,new HashSet<>()).size();
            if (reportCnt >= k) {
                for (String userId : map.get(reportId)) {
                    // str : 메일을 받을 유저 ID
                    int cnt = mailMap.getOrDefault(userId, 0)+1;
                    mailMap.put(userId,cnt);
                }
            }
        }
        return mailMap;
    }
    private static HashMap<String, HashSet<String>> report(String[] report) {
        HashMap<String, HashSet<String>> map = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            StringTokenizer st = new StringTokenizer(report[i], " ");
            String userId = st.nextToken();
            String reportId = st.nextToken();

            HashSet<String> set = map.getOrDefault(reportId, new HashSet<>());
            set.add(userId);
            map.put(reportId, set);
        }
        return map;
    }
}
