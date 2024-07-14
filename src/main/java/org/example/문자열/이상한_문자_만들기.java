package org.example.문자열;

/**
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 *
 * String.split(나눌 문자, 양수/음수/0)
 * 1) 양수 : 최대 나눌 요소 , 첫번째부터
 * 2) 음수 : 모든 패턴에 적용
 * 3) 0 : 결과에 끝부분 제외
 *
 */
public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "try hello world";

        System.out.println(solution(s)); //"TrY HeLlO WoRlD"
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int wordIndex = 0; // 각 단어의 인덱스를 추적하는 변수

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                answer.append(' ');
                wordIndex = 0; // 공백을 만나면 단어 인덱스를 초기화
            } else {
                if (wordIndex % 2 == 0) {
                    answer.append(Character.toUpperCase(arr[i]));
                } else {
                    answer.append(Character.toLowerCase(arr[i]));
                }
                wordIndex++; // 공백이 아닌 경우에만 단어 인덱스를 증가시킴
            }
        }

        return answer.toString();
    }
}
