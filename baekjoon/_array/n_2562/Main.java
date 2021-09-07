package baekjoon._array.n_2562;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[9];
        for(int i=0; i<9; i++){
            array[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(Arrays.stream(array).max().getAsInt());
        for(int j=0; j<array.length; j++){
            if(array[j] == Arrays.stream(array).max().getAsInt()){
                System.out.println(j+1);
            }
        }
    }
}
