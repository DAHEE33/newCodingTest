package org.example.해시;

import java.util.Arrays;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        System.out.println(solution(phone_book));
    }


    //접두어 포함 여부 , 포함시 false, 미포함시 true
    //접두사 시작할 때 startWith

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i + 1].startsWith(phone_book[i])) {
                answer =  false;
            }
        }
        return answer;
    }
}
