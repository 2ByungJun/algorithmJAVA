package baekjoon.inOut_10998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;

        a = sc.nextInt();
        b = sc.nextInt();

        sc.close();
        System.out.printf("%d", a*b);
    }
}