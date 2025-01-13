package org.example.lv2;

public class JadenCase_만들기 {
    public static void main(String[] args) {
        String s = "\"3people unFollowed me\"";
        System.out.println(solution(s)); //3
    }

    public static String solution(String s) {

//        StringBuilder result = new StringBuilder();
//
//        // 문자열 첫 번째 문자를 처리
//        boolean isNewWord = true; // 첫 문자도 새로운 단어로 간주
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//
//            if (c == ' ') {
//                result.append(c);
//                isNewWord = true; // 공백 이후는 새로운 단어로 간주
//            } else if (isNewWord) {
//                result.append(Character.toUpperCase(c)); // 단어의 첫 문자 대문자
//                isNewWord = false;
//            } else {
//                result.append(Character.toLowerCase(c)); // 나머지 문자는 소문자
//            }
//        }
//
//        return result.toString();


        String answer = "";

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(change(word)).append(" ");
        }


        answer = result.toString().trim();

        return answer;
    }

    public static String change(String s) {
        if (s.isEmpty()) {
            return s; // 빈 문자열 처리
        }

        // 첫 번째 문자를 대문자로 변환하고, 나머지는 소문자로 변환
        s = Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
        return s;
    }
}
