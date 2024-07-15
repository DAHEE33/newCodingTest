package org.example.문자열;

/**
 * 1) 진법 변환 대표
 *         int a = n;
 *         while (a > 0) {
 *             sb.append(a % 3);
 *             a /= 3;
 *         }
 *
 * 2) char -> int
 * Character.getNumericValue
 *
 * 3) Math.pow(a,b)
 * a를 b제곱
 *
 * 4)
 */
public class 진법_뒤집기 {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
//        int answer = 0;

        StringBuilder sb = new StringBuilder();

        //진법 변환 대표
        int a = n;
        while (a > 0) {
            sb.append(a % 3);
            a /= 3;
        }


        String reverseNum = sb.toString();  // 이미 3진수 변환 과정에서 뒤집힌 형태로 저장됨
        int decimalValue = 0;
        int powerOfThree = 1;  // 3의 제곱을 계산하기 위한 변수

        int length = reverseNum.length();
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(reverseNum.charAt(length - 1 - i));  // 뒤집힌 문자열을 다시 원래 순서로 가져옴
            decimalValue += digit * Math.pow(3, i);  // 10진수로 변환
        }

        //또 다른 진법 표현
        for (int i = 0; i < reverseNum.length(); i++) {
            int digit = Character.getNumericValue(reverseNum.charAt(i));
            decimalValue += digit * powerOfThree;
            powerOfThree *= 3;  // 다음 자릿수를 위해 3을 곱해줌
        }

        return decimalValue;
    }
}
