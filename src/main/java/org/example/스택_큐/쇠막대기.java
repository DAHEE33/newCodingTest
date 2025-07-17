package org.example.스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        String bar = in.nextLine();

        char[] chars = bar.toCharArray();

        Stack<Character> stack = new Stack<>();

        int count = 0;
        for (int i = 0; i < bar.length(); i++) {
            char now = bar.charAt(i);

            if (now == '(') {
                stack.push('(');
            } else { // now == ')'
                stack.pop();
                // 레이저: 바로 앞이 '('
                if (i > 0 && bar.charAt(i-1) == '(') {
                    count += stack.size();
                } else { // 막대 끝
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
