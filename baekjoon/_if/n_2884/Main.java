package baekjoon._if.n_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();
        sc.close();

        // 시간
        if(hour > 0 && min < 45){
            hour -= 1;
        }else if(hour <= 0 && min < 45){
            hour = 23;
        }

        // 분
        if(min > 45){
            min -= 45;
        }else if(min == 45){
            min = 0;
        }else{
            min = 60 + (min-45);
        }

        System.out.printf("%d %d", hour, min);
    }
}
