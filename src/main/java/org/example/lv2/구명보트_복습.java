package org.example.lv2;

import java.util.Arrays;

public class 구명보트_복습 {
    public static void main(String[] args) {
//        int[] people = {70, 50, 80, 50};
        int[] people = {70, 80, 50};
        int limit = 10;
        // 테스트 케이스
        System.out.println(solution(people , limit)); //3
    }

    public static int solution(int[] people, int limit) {
       int answer = 0 ;

       Arrays.sort(people);

       int left = 0;
       int right = people.length-1;

       //while문 안에서 if절 두번 탈 수 있음
//       while(left <= right){
//           if(people[left] + people[right] <= limit){
//               answer++;
//               left++;
//               right--;
//           }else{
//               answer++;
//               right--;
//           }
//       }

        //중복제거
        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람을 함께 태울 수 있는 경우
            if (people[left] + people[right] <= limit) {
                left++;
            }
            // 가장 무거운 사람을 혼자 태워야 하는 경우
            right--;
            // 보트를 사용
            answer++;
        }

       return answer;
    }
}
