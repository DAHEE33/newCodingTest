package org.example.정렬;

import java.util.*;

/**
 * 1. HashSet은 정렬을 제고하지 않아 ArrayList 변환 후 정렬해야한다. -> Collections.sort()
 * ArrayList<Integer> sortedList = new ArrayList<>(hashSet);
 *
 *
 * 2.HashSet을 배열로 변환
 * int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
 *
 */
public class 두개씩_뽑아서_더하기 {
    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        System.out.println(solution(numbers));
    }

    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ;i < numbers.length;i++){
            for(int j = 0 ; j < numbers.length; j++){
                int sum = 0;
                if(i != j){
                    sum = numbers[i] + numbers[j];
                    if(!set.contains(sum)){
                        set.add(sum);
                    }
                }
            }
        }


        // HashSet을 배열로 변환
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();

        // 배열 정렬
        Arrays.sort(answer);

        return answer;
    }
}
