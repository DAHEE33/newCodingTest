package org.example.lv2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        int num = 15;
        // 테스트 케이스
        System.out.println(solution(num));
    }
    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n ; i ++){
            int sum = 0;
            for(int j = i ; j <= n ; j ++){
                sum += j;
                if(sum == n) {
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
