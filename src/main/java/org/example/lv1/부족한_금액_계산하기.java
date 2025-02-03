package org.example.lv1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        return Math.max(0, sum - money);
    }
}
