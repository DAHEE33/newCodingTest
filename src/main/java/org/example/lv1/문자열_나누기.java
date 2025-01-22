package org.example.lv1;

public class 문자열_나누기 {

    public static void main(String[] args) {
//        String s = "banana";
        // 테스트 케이스
        String s = "abracadabra";
//        String s ="aaabbaccccabba";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        int answer = 0;

        int x_count = 0 ;
        int count = 0;
//        int begin = 0 ;
        char x = 0;

        for (int i = 0; i < s.length(); i++) {

            if(x_count == 0){
               x = s.charAt(i);
//                begin = i;
                x_count++;
            }else if(x == s.charAt(i)){
                x_count++;
            }else{
                count++;
            }

            if(x_count == count){
//                s.substring(begin,i+1);
                count = 0;
                x_count = 0;
                answer ++;
            }
        }

        if(count !=0 || x_count != 0){
            answer ++;
        }
        return answer;
    }
}
