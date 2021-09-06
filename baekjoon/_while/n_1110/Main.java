package baekjoon._while.n_1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        sc.close();

        int tempNum = inputNum;
        int fst = 0, sec = 0, sum = 0, count = 0;
        while(true){
            if(inputNum == tempNum && count > 0) break;

            if (tempNum >= 10){
                fst = tempNum / 10;
            }else{
                fst = 0;
            }
            sec = tempNum % 10;
            sum = fst + sec;

            // 새로운 num 구하기
            tempNum = (sec*10) + (sum%10);
            count++;
        }
        System.out.println(count);
    }
}
