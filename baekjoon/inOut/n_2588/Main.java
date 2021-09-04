package baekjoon.inOut.n_2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        sc.close();

        char[] str2Array = str2.toCharArray();

        for(int i=str2Array.length-1; i>=0; i--){
            System.out.println(Integer.parseInt(str1)*Character.getNumericValue(str2Array[i]));
        }
        System.out.println(Integer.parseInt(str1)*Integer.parseInt(str2));
    }
}
