package org.example.문자열;

/**
 *  s의 길이가 1~1000 -> 완전 탐색
 *
 *  substring(int beginIndex): 문자열의 beginIndex부터 끝까지 자릅니다.
 * substring(int beginIndex, int endIndex): 문자열의 beginIndex부터 endIndex까지 자릅니다. 여기서 endIndex는 포함되지 않습니다.
 *
 */
public class 문자열_압축 {
    public static void main(String[] args) {
        String s = "aabbaccc";

        System.out.println(solution(s)); //7 , a문자열 중 가장 짧은 것의 길이
    }

    public static int solution(String s) {
        int answer = 0;

        int startIndex = 0;
        int endIndex = 1;
        int wordLength = endIndex;
        int count = 0;

        for(int i =0;i<s.length();i++){
            int n = endIndex - startIndex;
            String word = s.substring(startIndex, endIndex);
            if(s.substring(startIndex, endIndex).equals(word)){
                count++;
            }
        }

        return answer;
    }
}
