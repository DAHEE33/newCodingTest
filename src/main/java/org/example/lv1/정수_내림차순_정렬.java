package org.example.lv1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순_정렬 {
    public static void main(String[] args){
         long n =118372;
        System.out.println(solution(n)); //3
    }

    public static long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        StringBuilder sortedStr = new StringBuilder(new String(charArray));
        sortedStr.reverse();


        answer = Long.parseLong(sortedStr.toString());
        return answer;
    }
}
