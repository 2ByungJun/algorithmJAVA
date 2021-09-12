package baekjoon._array.n_8958;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] strings = new String[num];
        for(int i=0; i<num; i++){
            strings[i] = sc.next();
        }
        sc.close();

        /** 점수계산 **/
        for(int j=0; j<num; j++){
            String[] strs = strings[j].split("X");
            int result = 0;
            for(String item : strs){
                for(int z=1; z<=item.length(); z++){
                    result += z;
                }
            }
            System.out.println(result);
        }
    }
}
