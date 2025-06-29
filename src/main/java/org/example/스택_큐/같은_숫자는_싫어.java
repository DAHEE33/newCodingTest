package org.example.스택_큐;

import java.util.LinkedList;
import java.util.Queue;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        int[] result = solution(arr);  // [1, 3, 0, 1]
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                queue.add(arr[i]);
            }
        }

        int[] answer = new int[queue.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }
}
