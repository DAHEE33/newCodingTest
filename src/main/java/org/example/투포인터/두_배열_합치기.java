package org.example.투포인터;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 두_배열_합치기 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        //첫번 째 배열
        int input1 = in.nextInt();
        int[] arr1 = new int[input1];
        for(int i=0; i<input1; i++){
            arr1[i]=in.nextInt();
        }

        //두 번째 배열
        int input2 = in.nextInt();
        int[] arr2 = new int[input2];
        for(int i=0; i<input2; i++){
            arr2[i]=in.nextInt();
        }

//        int[] mergedArray = solution(arr1, arr2);

        ArrayList<Integer> mergedArray = solution(arr1, arr2);

        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

//    public static int[] solution(int[] arr1, int[] arr2) {
//        int[] mergedArray = new int[arr1.length + arr2.length];
//
//        // 첫 번째 배열 복사
//        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
//
//        // 두 번째 배열 복사
//        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
//
//        Arrays.sort(mergedArray);
//        return mergedArray;
//    }

    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        int num1 = 0, num2 = 0;
        while(num1 < arr1.length && num2 < arr2.length){
            if(arr1[num1] < arr2[num2]) {
                list1.add(arr1[num1++]);
            }else list1.add(arr2[num2++]);
        }

        while(num1 < arr1.length){ list1.add(arr1[num1++]); }
        while(num2 < arr2.length){ list1.add(arr2[num2++]); }

        return list1;
    }
}
