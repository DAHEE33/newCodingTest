package org.example.문자열;

/**
 *  길이 비겨
 *
 */
public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        String s ="Pyy";

        System.out.println(solution(s)); // true
    }

    static boolean solution(String s) {
        boolean answer = true;

        //하나도 없는 경우 true

        s = s.toUpperCase();
        String p = s.replace("P", "");
        int p_leng = s.length() - p.length();

        String y = s.replace("Y","");
        int y_leng = s.length() - y.length();

        if(p_leng != y_leng){
            answer = false;
        }else{
            answer = true;
        }

        return answer;

//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//
//            if (s.charAt(i) == 'p')
//                count++;
//            else if (s.charAt(i) == 'y')
//                count--;
//        }
//
//        if (count == 0)
//            return true;
//        else
//            return false;
    }
}
