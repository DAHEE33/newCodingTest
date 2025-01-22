package org.example.lv1;

public class 카드뭉치 {

    public static void main(String[] args) {
//        String[] cards1 = {"i", "drink", "water"};

        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goals = {"i", "want", "to", "drink", "water"};
        // 테스트 케이스
        System.out.println(solution(cards1 , cards2, goals));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";

        int num1 = 0;
        int num2 = 0;

        for (String goalStr : goal) {
            if (num1 < cards1.length && cards1[num1].equals(goalStr)) {
                num1++;
            }else if (num2 < cards2.length && cards2[num2].equals(goalStr)) {
                num2++;
            }
            else {
                return "No";
            }
        }

        return "Yes";
    }
}
