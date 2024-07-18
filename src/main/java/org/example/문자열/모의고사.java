package org.example.문자열;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * stream 이용
 * 반복되는 값일 때 % 나머지 이용
 *
 */
public class 모의고사 {
    public static void main(String[] args) {

        int[][] pattern = {{1, 2, 3, 4, 5},
                {2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
    }

    public ArrayList<Integer> solution(int[] answers) {
        int[][] pattern = {{1, 2, 3, 4, 5},
                {2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
        ArrayList<Integer> ans = new ArrayList<>();

        int[] scores = new int[pattern.length];

        for(int i = 0; i < pattern.length;i++){
            for(int j =0;j< answers.length;j++){
                if(answers[j] == pattern[i][j% pattern[i].length]) scores[i]++;
            }
        }

        //배열의 오름차순 정렬 후 최대값 받기 -> stream 이용
        int maxScore = Arrays.stream(scores).max().getAsInt();

        for(int i = 0; i < scores.length;i++){
            if(maxScore == scores[i]) ans.add(i+1);
        }
        return ans;
    }
}
