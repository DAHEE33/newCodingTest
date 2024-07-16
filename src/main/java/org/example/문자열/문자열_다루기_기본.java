package org.example.문자열;

/**
 * 1) Character.isDigit() -> char -> 숫자여부 확인
 *
 * 2) 대소문자 범위 확인
 * ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
 *
 * 3) Character  비교
 *  - 문자 리터널 비교
 *   if (c < '0' || c > '9')
 *
 *  - 숫자 리터널 확인
 *   if (c < 48 || c > 57)
 */
public class 문자열_다루기_기본 {
    public static void main(String[] args) {

        String s = "1234";

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {
        boolean answer = true;
//        int cnt = 0;
        if(s.length() == 4 || s.length() ==6){
            for(int i = 0; i< s.length(); i ++){
//                if (!Character.isDigit(s.charAt(i))) {
//                    return false; // 숫자가 아닌 문자가 하나라도 있으면 false 반환
//                }
//                char c = s.charAt(i);
//                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) return false;

                char c = s.charAt(i);
                if (c < '0' || c > '9') { // 아스키 코드값이 숫자 범위 (48-57) 인지 확인
                    return false; // 숫자가 아닌 문자가 하나라도 있으면 false 반환
                }
            }
        }

//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                return true;
//            } catch(NumberFormatException e){
//                return false;
//            }
//        }
//        else return false;
        return answer;
    }
}
