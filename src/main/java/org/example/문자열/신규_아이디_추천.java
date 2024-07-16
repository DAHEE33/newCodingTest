package org.example.문자열;

/**
 * 정규 표현식
 * 1. 문자 클래스
 * [ 문자 표현 ]
 * - [a-z]: 소문자 알파벳
 * - [A-Z]: 대문자 알파벳
 * - [0-9]: 숫자
 * - [a-zA-Z0-9]: 알파벳 대소문자와 숫자
 * - [^a-z0-9]: 소문자 알파벳과 숫자를 제외한 문자
 *
 * [특수 문자 표현]
 *
 */
public class 신규_아이디_추천 {
    public static void main(String[] args) {

        String new_id = "...!@BaT#*..y.abcdefghijklm";

        System.out.println(new_id);
    }

    public static String solution(String new_id) {
        String answer = "";

        String s = new_id.toLowerCase();
        s.replaceAll("[^a-z0-9\\-_.]", "");


        return answer;
    }

    private static boolean isValidCharacter(char c) {
        // 알파벳 소문자 (a-z), 숫자 (0-9), 빼기(-), 밑줄(_), 마침표(.) 체크
        return (c >= 'a' && c <= 'z') ||
                (c >= '0' && c <= '9') ||
                c == '-' ||
                c == '_' ||
                c == '.';
    }
}
