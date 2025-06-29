package org.example.스택_큐;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 1. 대기큐 (우선순위, 인덱스) 쌍
 * 2. 우선순위용 큐(PriorityQueue)
 *
 */
public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        System.out.print(solution(priorities, location));
    }

    private static class Process{
        int priority; //우선순위
        int idx; //원래 위치

        Process(int priority, int idx){
            this.priority = priority;
            this.idx = idx;
        }

    }

    public static int solution(int[] priorities, int location) {

        Queue<Process> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b )-> b-a);//우선순위 높은 것으로 넣기

        for(int i = 0; i < priorities.length; i++){
            queue.add(new Process(priorities[i], i));
            priorityQueue.add(priorities[i]);
        }

        int count = 0;
        while(!queue.isEmpty()){
            Process process = queue.poll();
            int highest = priorityQueue.peek();
            
            if(process.priority < highest){
                queue.add(process);
            }else{
                priorityQueue.poll() ;
                count++;

                if(process.idx == location){
                    return count;
                }
            }
        }


        return count;
    }
}
