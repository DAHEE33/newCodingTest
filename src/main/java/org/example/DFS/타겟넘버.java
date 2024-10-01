package org.example.DFS;

import java.util.Stack;

public class 타겟넘버 {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        //방문 탐색 : 한 번 탐ㅁ색할 때마다 탐색 공간에서 서로 다른 경로를 선택하기 때문에 중복 검사 및 방문 검사가 필요하지 않다.

        //초기 상태
        Stack<state> stack = new Stack<>();
        stack.push(new state(0,0));

        int count= 0;
        //탐색 진행
        while(!stack.isEmpty()){

            //중복검사 : DFS 진행 중 이전에 방문했던 상태를 다시 만날 수도 있기 때문에, 중복검사

            //현재 상태 처리
            state state = stack.pop();

            if(state.index == numbers.length){
                if(state.acc == target) count++;
                continue;
            }

            //상태전이
            stack.push(new state(state.index +1, state.acc+ numbers[state.index]));
            stack.push(new state(state.index -1, state.acc+ numbers[state.index]));
        }
    }
    private static class state {
        public final int index;
        public final int acc;


        state(int index, int acc){
            this.index = index;
            this.acc = acc;
        }
    }

}
