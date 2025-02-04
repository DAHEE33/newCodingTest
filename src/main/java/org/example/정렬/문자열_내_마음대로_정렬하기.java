package org.example.정렬;

import java.util.HashMap;

/**
 * 사전 순 정렬 -> 오름차순으로 이용가능
 *
 * 버블 정렬 이용
 */
public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        System.out.println(solution(strings,n));
    }

    public static String[] solution(String[] strings, int n) {

        //가장 많이 쓰는 종류!!
//        Arrays.sort(strings, (s1, s2) -> {
//            if (s1.charAt(n) == s2.charAt(n)) {
//                return s1.compareTo(s2);
//            } else {
//                return Character.compare(s1.charAt(n), s2.charAt(n));
//            }
//        });
//
//        return strings;

        //버블 정렬 이용
        // 문자열 배열의 길이를 구함
        int length = strings.length;

        // 버블 정렬을 사용하여 n번째 문자를 기준으로 정렬
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                // n번째 문자가 같을 경우 전체 문자열로 비교하여 사전순으로 정렬
                if (strings[j].charAt(n) == strings[j + 1].charAt(n)) {
                    if (strings[j].compareTo(strings[j + 1]) > 0) {
                        // swap strings[j] and strings[j + 1]
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                    }
                } else if (strings[j].charAt(n) > strings[j + 1].charAt(n)) {
                    // n번째 문자를 기준으로 정렬
                    // swap strings[j] and strings[j + 1]
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        return strings;
    }
}
