package org.example.다시풀기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 큐_응급실 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Queue<Patient> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.offer(new Patient(i, sc.nextInt()));
        }

        int order = 0;
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();

            boolean hasMoreDangerous = false;
            for (Patient patient1 : queue) {
                if (patient1.risk > patient.risk) {
                    hasMoreDangerous = true;
                    break;
                }
            }

            if (hasMoreDangerous) {
                queue.offer(patient);
            } else {
                order++;
                if (patient.index == M) {
                    System.out.printf(String.valueOf(order));
                    return;
                }
            }
        }





    }

    static class Patient {
        int index;
        int risk;
        Patient(int index, int risk) {
            this.index = index;
            this.risk = risk;
        }
    }
}
