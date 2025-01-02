package org.example.lv1;


/**
 * 자릿수 - 나머지(%) 자릿수 , 몫(/) 오른쪽 자리 없애기
 */
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

        String number = String.valueOf(n); //Integer.toString(number);

        char[] arr = number.toCharArray();

        for (char c : arr) {
            answer += Character.getNumericValue(c);
        }

        return answer;
    }


//    public class Solution {
//        public int solution(int n) {
//            int answer = 0;
//
//            while (n != 0) {
//                answer += n % 10;
//                n /= 10;
//            }
//
//            return answer;
//        }
//    }
}
