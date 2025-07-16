package org.example.스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 크레인_인형뽑기 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        // 2차원 배열 입력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int moves = in.nextInt();
        int[] movesArr = new int[moves];
        for (int i = 0; i < moves; i++) {
            movesArr[i] = in.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < moves; i++) {
            int col = movesArr[i] - 1; // 입력은 1부터, 배열 인덱스는 0부터

            // 해당 열의 맨 위 인형 찾기
            for (int row = 0; row < n; row++) {
                if (arr[row][col] != 0) {      // 인형 발견!
                    int doll = arr[row][col];  // 뽑을 인형
                    arr[row][col] = 0;         // 인형 자리는 0으로 처리

                    if (!stack.isEmpty() && stack.peek() == doll) {
                        stack.pop();           // 같은 인형이면 터뜨림
                        cnt += 2;
                    } else {
                        stack.push(doll);      // 아니면 스택에 넣음
                    }
                    break; // 한 번 뽑으면 그만!
                }
            }
        }

        System.out.println(cnt);
    }
}
