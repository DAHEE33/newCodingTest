package org.example.lv2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        String s = "baabaa";
        // 테스트 케이스
        System.out.println(solution(s));
    }

    public static int solution(String s) {

            int answer = 0;

            Stack<Character> stack = new Stack<>();

            for (Character character : s.toCharArray()) {
                if (!stack.isEmpty() && stack.peek() == character) {
                    stack.pop();
                } else {
                    stack.push(character);
                }
            }

            if (stack.empty()) {
                answer = 1;
            } else {
                answer = 0;
            }
            return answer;
    }
}
