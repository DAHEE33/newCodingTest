package org.example.문자열;

/**
 *  s 길이 1이상 150,000 -> 완전 탐색
 *  1) String.replace
 *     replace(): 입력을 일반 문자열로 처리합니다.
 *     replaceAll(): 입력을 정규 표현식으로 처리합니다.
 *  2) String.split
 */
public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        String s = "01110"; //[3,8] [진법 변환 횟수, 변환 과정에서 삭제한 0의 개수]

        int[] result = solution(s);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        int a = 0; // 진법 변환 횟수 -> 진법 변환 메서드
        int b = 0; // 삭제한 0의 개수

        while(!s.equals("1")){
            String newS = s.replace("0","");
            int newLength = newS.length();
            b += (s.length() - newS.length());

            s = convertInt(newLength);
            a++;

        }

        answer[0] = a;
        answer[1] = b;


        return answer;
    }

    public static String convertInt(int n){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n%2);
            n /=2;
        }

        return sb.reverse().toString();


    }
}
