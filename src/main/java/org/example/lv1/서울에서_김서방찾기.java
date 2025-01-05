package org.example.lv1;

public class 서울에서_김서방찾기 {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        // 테스트 케이스
        System.out.println(solution(seoul));
    }
    public static String solution(String[] seoul) {
        String answer = "";

        int num = 0;
        for (int i = 0 ; i< seoul.length; i++){
            if("Kim".equals(seoul[i])){
                num = i;
            }
        }
        answer = "김서방은 " + num + "에 있다";
        return answer;
    }
}
