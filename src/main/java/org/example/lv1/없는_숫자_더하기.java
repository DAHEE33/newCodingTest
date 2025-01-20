package org.example.lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i <= 9; i++) {
            allNumbers.add(i);
        }

        for (int number : numbers) {
            allNumbers.remove(number);
        }

        int sum = 0;
        for (int missingNumber : allNumbers) {
            sum += missingNumber;
        }

        return sum;
    }
}
