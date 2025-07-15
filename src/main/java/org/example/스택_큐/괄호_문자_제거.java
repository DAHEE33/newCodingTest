package org.example.스택_큐;

import java.util.Scanner;

public class 괄호_문자_제거 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        StringBuilder sb = new StringBuilder();
        int cnt = 0; // 괄호 안에 있으면 >0

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                cnt++; // 괄호 깊이++
            } else if (ch == ')') {
                cnt--; // 괄호 깊이--
            } else {
                if (cnt == 0) { // 괄호 밖이면 문자 추가
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
