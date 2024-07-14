package org.example.문자열;

/**
 * char -> int 시 아스키 코드 주의
 * 문자열을 정수 변환시엔 Integer.parseInt 이용
 * char를 int로 변경시 Character.getNumericValue
 *
 */
public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        long n = 12345;

        System.out.println(solution(n));
    }

    public static int[] solution(long n) {
        String num = String.valueOf(n);
        StringBuffer sb = new StringBuffer(num);
        String reverseNum = sb.reverse().toString();
        char[] arr = reverseNum.toCharArray();
        int[] answer = new int[arr.length];

        for (int i = 0; i< arr.length;i++) {
            answer[i] = arr[i]-'0';
        }
        return answer;
    }

//    public int[] solution(long n) {
//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//    }
}
