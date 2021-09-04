package bookCodingTest.implementation.ex4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("최종 시각을 입력해주세요(00:00:00 ~ N:59:59) : ");
        int n = sc.nextInt();

        if(n < 0 || n > 23) {
            System.out.println("n은 0부터 23까지 입력할 수 있습니다.");
            return;
        }

        System.out.println("입력된 값 : " + n);
        System.out.println("최종 결과 : " + solution(n));
    }

    public static int solution(int n) {
        int count = 0;
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<60; j++) {
                for(int k=0; k<60; k++) {
                    if( Integer.toString(i).contains("3") || Integer.toString(j).contains("3") || Integer.toString(k).contains("3") ) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
