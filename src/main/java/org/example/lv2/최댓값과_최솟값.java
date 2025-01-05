package org.example.lv2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        // 테스트 케이스
        System.out.println(solution(s));
    }
    public static String solution(String s) {
        String answer = "";

        int[] numbers = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if(number < min) min = number;

        }

        for (int number : numbers) {
            if(number > max) max = number;

        }

        answer = min + " " + max;

        return answer;
    }
}
