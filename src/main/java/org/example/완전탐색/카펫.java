package org.example.완전탐색;

/**
 *이 문제는 주어진 카펫의 갈색 격자의 개수(brown)와 노란색 격자의 개수(yellow)를 통해 카펫의 가로와 세로 크기(행과 열)를 배열에 담아 반환하는 문제다.
 * 문제에서 주어진 카펫의 노란색 격자는 갈색 격자 1줄로 감싸져 있으므로 (행 - 2) * (열 - 2) 공식으로 노란색 격자의 개수를 구할 수 있다.
 * 노란색 격자의 개수는 항상 1개 이상이므로 최소 행과 열(카펫의 최소 크기 3 x 3)은 3 이상이며, 최대 행의 수 있는 수는 (총 격자의 수 / 2)이고, 열은 행이 증가함에 따라 (총 격자의 수 / 행)으로 계산할 수 있다.
 */
public class 카펫 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;


        System.out.println(solution(brown, yellow));
    }

    public static int[] solution(int brown, int yellow) {

        int[] arr = new int[2];
        int sum = brown + yellow; // 격자 총 개수
        for(int i =3 ;i<sum/2 ;i ++){ // 최소 가로 행의 수 3, 최대 격자 수 sum/2
            int row = i;
            int col = sum/row;

            if((row - 2) * (col-2) == yellow){
                arr[0] = col;
                arr[1] = row;
                break;
            }

        }
        return arr;

//        int[] answer = new int[2];
//
//        int carpet = brown + yellow;
//
//        for(int i = 3;i<=carpet;i++){
//            int w = i;
//            int h = carpet/w;
//
//            if(w >=3 && h>=3) {
//                int bow = 2 * (w + h - 2);
//                int cen = w * h - bow;
//
//                if (brown == bow && yellow == cen){
//                    answer[0] = w;
//                    answer[1] = h;
//                }
//            }
//        }
//
//        return answer;

    }

}
