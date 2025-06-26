package org.example.해시;


import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String cloth_type = cloth[1];
            map.put(cloth_type, map.getOrDefault(cloth_type, 0) + 1);
        }

        for (Integer value : map.values()) {
            answer *= (value + 1);
        }
        return answer - 1;
    }
}
