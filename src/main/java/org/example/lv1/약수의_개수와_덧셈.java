package org.example.lv1;

public class 약수의_개수와_덧셈 {

    public static void main(String[] args) {
        int left = 13;
        int right = 17;
        // 테스트 케이스
        System.out.println(solution(left, right));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for(int i = left ; i <= right ; i++){
            int count = 0 ;
            for(int j = 1 ; j <= Math.sqrt(i) ; j++){
                if(i % j == 0 && i/j == j) count ++;
            }
            if(count == 1) answer -= i;
            else answer += i;
        }
        return answer;
    }
}
