package org.example.lv1;

public class 나머지가_1이_되는수 {
    public int solution(int n) {
        n =12;
        int answer = 0;


        for (int i = 2; i < n; i++) { // n-1로 제한하지 않아도 됨
            if (n % i == 1) {
                return i; // 가장 작은 i를 바로 반환
            }
        }
        return 0;
    }
}
