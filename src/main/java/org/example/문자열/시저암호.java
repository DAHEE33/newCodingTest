package org.example.문자열;

/**
 * 아스키 코드 범위
 * <p>
 * 문자열, 숫자 관계
 * <p>
 * 1) 대문자 알파벳:
 * <p>
 * 'A'부터 'Z'까지: ASCII 코드 65부터 90까지
 * 예: 'A' (65), 'B' (66), ..., 'Z' (90)
 * <p>
 * 2) 소문자 알파벳:
 * <p>
 * 'a'부터 'z'까지: ASCII 코드 97부터 122까지
 * 예: 'a' (97), 'b' (98), ..., 'z' (122)
 * <p>
 * ex. if((c >= 90 && c < 97) || c >= 122)
 * 대문자 :  65 ~ 90
 * 소문자 : 97 ~ 122
 * <p>
 * 90 ~ 97 사이, 122 이상인 경우
 * <p>
 * 3) 공백 문자:
 * <p>
 * ' ' (공백): ASCII 코드 32
 * <p>
 * 4) 숫자:
 * <p>
 * '0'부터 '9'까지: ASCII 코드 48부터 57까지
 * 예: '0' (48), '1' (49), ..., '9' (57)
 * <p>
 * 5) 알파벳의 순환의 경우 26
 * <p>
 * 6) char[i] - '0' : 숫자 문자를 실제 숫자값으로 반환
 * 7) char[i] + '0' : 실제 숫자를 문자로 변환
 * 8) Character에서 숫자 더하면 아스키 숫자, 문자를 더하면 String
 * 9) Character에서 +- 'A','a' : 아스키 숫자 char에서 연산
 * 10) (char) 아스키 숫자 -> char로 변경
 *
 * 'A'는 65, 'a'는 97

 */
public class 시저암호 {
    public static void main(String[] args) {
        String s = "AB";
        int n = 1;

        System.out.println(solution(s, n));
    }

    public static String solution(String s, int n) {
        String answer = "";

        char[] arr = s.toCharArray();

        for (char c : arr) {
            if (c != 32) {
                if (c >= 65 && c <= 90) {
                    c += n;
                    if (c > 90) c -= 26;
                    answer += c;
                } else if (c >= 97 && c <= 122) {
                    c += n;
                    if (c > 122) c -= 26;
                    answer += c;
                }
            } else {
                answer += c;
            }
        }

        return answer;
    }
}


//    StringBuilder answer = new StringBuilder();
//
//        for (char c : s.toCharArray()) {
//        if (c >= 'A' && c <= 'Z') { // 대문자인 경우
//            c = (char) ((c - 'A' + n) % 26 + 'A');
//        } else if (c >= 'a' && c <= 'z') { // 소문자인 경우
//            c = (char) ((c - 'a' + n) % 26 + 'a');
//        }
//        answer.append(c); // 변환된 문자 또는 그대로의 문자를 추가
//    }
//
//        return answer.toString();
