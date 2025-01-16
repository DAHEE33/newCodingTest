package org.example.lv1;

public class 삼총사 {

    public static void main(String[] args){
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number)); //3
    }

    public static int solution(int[] number) {
        int answer = 0;

        // 첫 번째 루프
        for (int i = 0; i < number.length - 2; i++) {
            // 두 번째 루프 (i 이후부터 시작)
            for (int j = i + 1; j < number.length - 1; j++) {
                // 세 번째 루프 (j 이후부터 시작)
                for (int k = j + 1; k < number.length; k++) {
                    // 세 숫자의 합이 0인지 확인
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
