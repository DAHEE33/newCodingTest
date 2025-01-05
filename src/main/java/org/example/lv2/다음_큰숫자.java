package org.example.lv2;

public class 다음_큰숫자 {
    public static void main(String[] args) {
        int num = 78;
        // 테스트 케이스
        System.out.println(solution(num));
    }

    public static int solution(int n) {
        int answer = 0;
        boolean find = false;
        String org_bin = Integer.toBinaryString(n);

        int count = countOne(org_bin);

        while(!find){
            int num = ++n;
            String bin = Integer.toBinaryString(num);

            int bin_count = countOne(bin);

            if(count == bin_count) {
                answer = num;
                find = true;
            }
        }
        return answer;
    }

    public static int countOne(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
