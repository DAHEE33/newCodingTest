package org.example.스택_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 요세푸스 문제(Josephus Problem)
 */

public class 공주_구하기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            q.offer(i);
        }
        int i = 1;
        while (q.size() != 1) {
            if (i % k == 0) {
                q.poll();
            } else {
                q.offer(q.poll());
            }
            i++;

        }


        System.out.println(q.peek());
    }
}
