package org.example.정렬;

import java.util.Arrays;
import java.util.Collections;

/**
 * 배열의 역전환  Arrays.sort(arr, Collections.reverseOrder());
 *
 * 문자열 넣기
 */
public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {

        String s = "Zbcdefg";

        System.out.println(solution(s));
    }

    public static String solution(String s) {

        Character[] arr = new Character[s.length()];
        for(int i = 0 ; i< s.length() ; i++){
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb= new StringBuilder();
        for(int i = 0 ; i< arr.length; i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}
