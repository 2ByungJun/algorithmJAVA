package baekjoon._for.n_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        for(int i=1; i<=num; i++){
            for(int z=0; z<num-i; z++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
