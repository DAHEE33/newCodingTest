package org.example.스택_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String re_subject = in.nextLine();
        String subjects = in.nextLine();

        char[] re_chars = re_subject.toCharArray();
        char[] chr = subjects.toCharArray();

        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < chr.length; i++) {
            queue.add(chr[i]);
        }

        int cnt = 0;
        for (int i = 0; i < chr.length; i++) {
            if(queue.poll() == re_chars[cnt]){
                cnt++;
            }
            if(cnt == re_chars.length){
                break;
            }
        }

        if(cnt == re_chars.length) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}
