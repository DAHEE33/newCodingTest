package org.example.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 제일_작은수_제거 {
    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1}))); // [4, 3, 2]
        System.out.println(Arrays.toString(solution(new int[]{10})));        // [-1]
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int minValue = Arrays.stream(arr).min().getAsInt();

        List<Integer> resultList = new ArrayList<>();
        for (int num : arr) {
            if (num != minValue) {
                resultList.add(num);
            }
        }

        return resultList.stream().mapToInt(i -> i).toArray();
    }
}
