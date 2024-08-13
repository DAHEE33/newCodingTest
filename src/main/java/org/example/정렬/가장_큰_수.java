package org.example.정렬;

import java.util.Arrays;

/**
 * int 배열을 String 배열로 변환하는 방법
 * 1.직접 변환 (for 루프)
 *
 * 2.Stream API
 * :Arrays.stream(intArray)를 사용하여 int 배열을 스트림으로 변환한 후,
 * mapToObj(String::valueOf)를 사용하여 각 요소를 String으로 변환하고,
 * 최종적으로 toArray(String[]::new)를 사용하여 String 배열로 변환
 *
 * 3.Arrays.setAll
 * :이 방법은 배열을 효율적으로 초기화하고 변환하는 데 유용합니다. i -> String.valueOf(intArray[i]) 람다 표현식을 사용하여 각 요소를 변환합니다.
 *
 *
 *
 */
public class 가장_큰_수 {
    public static void main(String[] args) {

        int[] numbers = {6, 10, 2};
        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        String answer = "";

        String[] numberStr = new String[numbers.length];

        // int 배열을 String 배열로 변환
        for(int i = 0; i < numbers.length; i++)
            numberStr[i] = String.valueOf(numbers[i]);

        // 커스텀 Comparator를 사용하여 정렬
        Arrays.sort(numberStr, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 정렬된 배열을 하나의 문자열로 합침
        for(String str: numberStr)
            answer += str;

        // 첫 번째 문자가 '0'이면 (즉, 전체 숫자가 0으로만 이루어진 경우) "0"을 반환
        if(answer.charAt(0) == '0'){
            answer = "0";
        }

        return answer;
    }
}
