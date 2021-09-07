package baekjoon._array.n_2577;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int number = A * B * C;

        // number 길이 구하는 공식
        //        int length = (int)Math.log10(number)+1;

        // int -changed-> int[]
        int[] digits = Stream.of(String.valueOf(number).split("")).mapToInt(Integer::parseInt).toArray();
        int[] counts = new int[10];

        // counts 를 0으로 초기화
        Arrays.fill(counts, 0);

        // digits value 값에 따라 특정 counts 자릿수의 값 증가
        for(int i=0; i<digits.length; i++){
            counts[digits[i]] += 1;
        }

        // counts 값 출력
        for(int count : counts){
            System.out.println(count);
        }
    }
}
