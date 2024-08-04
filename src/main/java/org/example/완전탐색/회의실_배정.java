package org.example.완전탐색;

import java.util.*;

public class 회의실_배정 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();


		/*
		  time[][0] 은 시작시점을 의미
		  time[][1] 은 종료시점을 의미
		*/
        int[][] time = new int[N][2];


        for(int i = 0; i < N; i++) {
            time[i][0] = in.nextInt();	// 시작시간
            time[i][1] = in.nextInt();	// 종료시간
        }


        // 끝나는 시간을 기준으로 정렬하기 위해 compare 재정의
        Arrays.sort(time, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }

        });

        int cnt = 1;

        int end_time = time[0][1];

        for(int i = 1;i<time.length;i++){
            if(end_time <= time[i][0]){
                end_time = time[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);
    }


}
