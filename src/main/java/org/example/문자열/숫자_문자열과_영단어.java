package org.example.문자열;

import java.util.HashMap;

/**
 * Integer.toString(i)
 *  : 정수 i를 문자열로 변환하는 메서드
 */
public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {

        String s = "one4seveneight";

        System.out.println(solution(s));
    }

    public static int solution(String s) {
//        int answer = 0;

        HashMap<String, String> map = new HashMap<>();
        map.put("zero", "0" );
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine","9");

        for (String key : map.keySet()) {
            if(s.contains(key)){
                s =  s.replace(key, map.get(key));
            }
        }
        return Integer.parseInt(s);

        //전체 for문으로 돌면서 ..
//        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        for(int i = 0; i < strArr.length; i++) {
//            s = s.replaceAll(strArr[i], Integer.toString(i));
//        }
//        return Integer.parseInt(s);
    }
}
