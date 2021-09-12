package baekjoon._array.n_4344;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        Double[] percents = new Double[testCase];
        for(int i=0; i<testCase; i++){
            int personCnt = sc.nextInt();
            int[] personScore = new int[personCnt];
            for(int j=0; j<personCnt; j++){
                personScore[j] = sc.nextInt();
            }

            int count = 0;
            for(int z=0; z<personCnt; z++){
                if(personScore[z] > Arrays.stream(personScore).average().getAsDouble()){
                    count++;
                }
            }

            double percent = ((double)count/personCnt)*100;
            percents[i] = percent;
        }
        sc.close();

        for(int i=0; i<percents.length; i++){
            System.out.printf("%.3f%%\n", percents[i]);
        }
    }
}
