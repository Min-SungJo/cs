package org.example;

import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 크롤러2 {

    private static final String BASE_URL = "https://m.map.naver.com/search2/search.naver?query=";
    private static String placeName = "광주광역시청";

    private static final Pattern ID_PATTERN = Pattern.compile("\"id\": \"(\\d+)\"");
    private static final Pattern PHOTO_PATTERN = Pattern.compile("\"__typename\":\"Image\",\"origin\":\"(.*?)\"");

    /**
     * 특정 장소 사진 url 추출하기
     * @param html
     * @param pattern
     * @return 사진 url 리스트
     */
    public static ArrayList<String> getMatcherPlacePhoto(String html, Pattern pattern) {
        Matcher matcher = pattern.matcher(html);
        ArrayList<String> list = new ArrayList<>();
        while (matcher.find()) {
            String photoValue = matcher.group(1);
            list.add(photoValue.replace("\\u002F", "/"));
        }
        return list;
    }

    /**
     * html 에서 특정 장소의 id 값 추출하기
     * @param html
     * @param pattern
     * @return 장소 id
     */
    public static String getMatcherPlaceId(String html, Pattern pattern) {
        Matcher matcher = pattern.matcher(html);
        return matcher.find() ? matcher.group(1) : null;
    }

    /**
     * 입력된 url의 html 추출하기
     * @param url
     * @return url의 html
     * @throws IOException
     */
    public static String getHTMLDocument(String url) throws IOException {
        return Jsoup.connect(url).get().toString();
    }

    public static ArrayList<String> getImages() throws IOException {
        // 1. 네이버 지도에 특정 장소 검색
        String mapHtml = getHTMLDocument(BASE_URL + placeName);
        // 2. 장소의 특정 id 추출
        String id = getMatcherPlaceId(mapHtml, ID_PATTERN);
        // 3. id를 기반으로 네이버 플레이스 사진 페이지 접근
        String mapPhotoUrl = "https://m.place.naver.com/place/" + id + "/photo";
        String mapPhotoHtml = getHTMLDocument(mapPhotoUrl);
        // 4. 특정 장소의 대표 사진 리스트 불러오기
        return getMatcherPlacePhoto(mapPhotoHtml, PHOTO_PATTERN);
    }
}