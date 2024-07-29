package org.example.완전탐색;

import java.util.ArrayList;
import java.util.List;

public class 수식_최대화2{

    static String[][] operator = {{"+", "-", "*"}, {"+", "*", "-"}, {"*", "+", "-"}, {"*", "-", "+"}, {"-", "*", "+"}, {"-", "+", "*"}};
    static List<Long> exp_val;
    static List<Character> exp_ope;

    public static void main(String[] args) {
        String expression = "100-200*300-500+20";
        long result = solution(expression);

        System.out.println(result);
    }

    public static long solution(String expression) {
        long answer = 0;

        exp_val = new ArrayList<>();
        exp_ope = new ArrayList<>();

        int exp_len = expression.length();
        int start = 0;

        for (int i = 0; i < exp_len; i++) {
            char exp = expression.charAt(i);
            if (exp == '-' || exp == '*' || exp == '+') {
                exp_val.add(Long.parseLong(expression.substring(start, i)));
                exp_ope.add(exp);
                start = i + 1;
            }
        }
        exp_val.add(Long.parseLong(expression.substring(start, exp_len)));

        int ope_len = operator.length;
        for (int i = 0; i < ope_len; i++) {
            List<Long> val = new ArrayList<>(exp_val);
            List<Character> ope = new ArrayList<>(exp_ope);

            for (int j = 0; j < operator[i].length; j++) {
                for (int k = 0; k < ope.size(); ) {
                    if (operator[i][j].equals(ope.get(k))) {
                        val.set(k, calc(val.get(k), val.get(k + 1), ope.get(k)));
                        val.remove(k-1);
                        val.remove(k+1);
                        ope.remove(k);
                    } else {
                        k++;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(val.get(0)));
        }
        return answer;
    }

    public static long calc(long preNum, long nxtNum, char ope) {
        if (ope == '+') {
            return preNum + nxtNum;
        } else if (ope == '-') {
            return preNum - nxtNum;
        } else {
            return preNum * nxtNum;
        }
    }

}