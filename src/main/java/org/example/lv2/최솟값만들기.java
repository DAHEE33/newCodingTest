package org.example.lv2;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);

        //성능 및 오버헤드 문제
//        Integer[] intB = Arrays.stream(B).boxed().toArray(Integer[] :: new);
//        Arrays.sort(intB, Collections.reverseOrder());
//
//        for(int i = 0 ; i < A.length; i++){
//            answer += A[i] * intB[i];
//        }

        Arrays.sort(B); // 오름차순 정렬 (B도 오름차순으로 정렬한 뒤 뒤에서부터 값 사용)

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i]; // B는 역순으로 곱함
        }


        return answer;
    }
}
