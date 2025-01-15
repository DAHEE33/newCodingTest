package org.example.lv2;

import java.util.Arrays;

/**
 * max값 = Integer.min
 *
 * 오름차순 배열
 *
 * for문
 *
 * i 이상 숫자일 때 count++
 *
 * i == count일 때 h값
 *
 * for문 돌면서 h값 구하면 됨
 */
public class H_index {

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(solution(citations)); //3
    }
      public static int solution(int[] citations) {
//        int answer = 0;
//
//        int max = Integer.MIN_VALUE;
//
//          Arrays.sort(citations);
//
//          for(int i = 0 ; i < citations.length ; i++){
//              if(citations.length - i == citations[i]) max = citations[i];
//          }
//          answer = max;
//        return answer;

        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;

            if (citations[i] >= h) {
                return h;
            }
        }

        return 0;

    }
}
