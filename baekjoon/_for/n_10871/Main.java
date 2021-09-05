package baekjoon._for.n_10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int max = sc.nextInt();
        int[] array = new int[num];
        for (int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        for(int j=0; j<num; j++){
            if(array[j] < max){
                System.out.print(array[j] + " ");
            }
        }
    }
}
