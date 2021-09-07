package baekjoon._array.n_10818;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.stream(array).min().getAsInt() + " " +  Arrays.stream(array).max().getAsInt());
    }
}
