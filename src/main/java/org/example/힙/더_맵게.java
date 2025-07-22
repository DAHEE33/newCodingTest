package org.example.힙;


import java.util.PriorityQueue;

public class 더_맵게 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        for (int i = 0; i < scoville.length; i++) {
            pq.add(scoville[i]);
        }

        int mixCount = 0;

        while (pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int newFood = first + second * 2;
            pq.add(newFood);
            mixCount++;
        }

        return pq.peek() >= K ? mixCount : -1;

    }

}
