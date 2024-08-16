package org.example.해시;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 boxed() 메서드는 Java의 스트림 API에서 기본형 프리미티브 타입(int, long, double 등)의 스트림을 해당하는 래퍼 클래스 타입(Integer, Long, Double 등)의 스트림으로 변환하는 역할


 */
public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers) {
        int answer = 0;

        // 배열을 HashSet으로 변환
//        Set<Integer> intSet = new HashSet<>();
//        for (int num : intArray) {
//            intSet.add(num);
//        }

        //int를 set으로 변환
        Set<Integer> intSet = Arrays.stream(numbers)
                .boxed().collect(Collectors.toSet());

        for(int i = 0 ;i < 10 ; i ++){
            if(!intSet.contains(i)) answer += i ;
        }
        return answer;
    }
}
