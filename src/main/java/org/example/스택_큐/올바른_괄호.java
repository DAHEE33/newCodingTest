package org.example.스택_큐;

import java.util.Stack;

public class 올바른_괄호 {
    public static void main(String[] args) {
        String s = ")()(";


        System.out.print(solution(s));
    }

    static boolean solution(String s) {
        boolean answer = false;

        char[ ] c = s.toCharArray();
        Stack< Character> stack = new Stack< Character>();
        for (int i = 0; i < c.length; i++) {
            if(c[0] == ')'){
                return answer;
            }

            if(c[i] == '('){
                stack.push(c[i]);
            }else if(c[i] == ')'){
                stack.pop();
            }
        }

        if(stack.isEmpty()){answer = true;}

        return answer;
    }
}
