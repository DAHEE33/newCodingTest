package org.example.lv2;

import java.util.Arrays;

public class 구명보트 {

    public static void main(String[] args) {
        int[] people = {70, 50, 80, 50};
        int limit = 10;
        // 테스트 케이스
        System.out.println(solution(people , limit));
    }

    public static int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;
        Arrays.sort(people);

        for (int max = people.length - 1; max >= min; max--) {
            int weight = people[min] + people[max];
            if (weight <= limit) {
                min++;
                answer++;
            }

            if (weight > limit) {
                answer++;
            }
        }
        return answer;
    }
}
