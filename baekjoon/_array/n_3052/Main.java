package baekjoon._array.n_3052;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] digits = new int[10];
        for(int i=0; i<10; i++){
            digits[i] = sc.nextInt();
        }

        // 42로 나눈 나머지
        for(int j=0; j<digits.length; j++){
            digits[j] = digits[j]%42;
        }

        // 나머지 배열 중복제거
        digits = Arrays.stream(digits).distinct().toArray();

        // 출력
        System.out.println(digits.length);
    }
}
