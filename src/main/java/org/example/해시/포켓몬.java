package org.example.해시;

import java.util.HashSet;
import java.util.Set;

public class 포켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};

        System.out.println(solution(nums));
    }

    // 최대 N/2
    // 중복을 제거 -> 남는 숫자
    // 이 중 최대 큰 것
    public static int solution(int[] nums) {
        int length = nums.length/2;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int setSize = set.size();

        return Math.min(setSize, length);
    }


}
