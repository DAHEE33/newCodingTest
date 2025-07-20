package org.example.스택_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계_강의 {
    public static void main(String[] args) {
        String answer = "YES";

        Scanner in = new Scanner(System.in);

        String re_subject = in.nextLine();
        String subjects = in.nextLine();


        Queue<Character> queue = new LinkedList<>();

        for (char c : re_subject.toCharArray()) {
            queue.offer(c);
        }
        for (char c : subjects.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) {
                    answer = "NO";
                }
            }
        }


        System.out.printf(answer);
    }
}
