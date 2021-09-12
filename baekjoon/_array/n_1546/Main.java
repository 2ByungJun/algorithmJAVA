package baekjoon._array.n_1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        double[] doubles = new double[num];
        for(int i=0; i<num; i++){
            doubles[i] = sc.nextDouble();
        }
        sc.close();

        /** max값 찾기 **/
        double max = Arrays.stream(doubles).max().getAsDouble();

        for(int j=0; j<num; j++){
            doubles[j] = doubles[j]/max*100;
        }

        System.out.println(Arrays.stream(doubles).average().getAsDouble());
    }
}
