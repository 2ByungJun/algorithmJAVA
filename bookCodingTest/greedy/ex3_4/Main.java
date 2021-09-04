package bookCodingTest.greedy.ex3_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int k = 0;
        int result = 0;

        /* 입력 */
        System.out.print("N 입력 : ");
        n = sc.nextInt();
        System.out.print("K 입력 : ");
        k = sc.nextInt();

        /* 예외처리 */
        if(n < k) {
            System.out.println("N은 K보다 크거나 같아야 합니다.");
            return;
        }
        if(2 > n && n > 100000 && 2 > k && k > 100000) {
            System.out.println("N과 K의 범위를 다시 확인해주세요.");
            return;
        }

        long start_time = System.currentTimeMillis();
        result = solution(n, k);
        long end_time = System.currentTimeMillis();

        System.out.println("@최종 결과 : " + result);
        System.out.println("@측정 시간 : " + (start_time - end_time)/1000.0);
    }

    public static int solution(int n, int k) {
        int count = 0;
        while(n > 1) {
            if(n % k != 0) {
                n -= 1;
                count++;
            }else {
                n /= k;
                count++;
            }
        }
        return count;
    }
}
