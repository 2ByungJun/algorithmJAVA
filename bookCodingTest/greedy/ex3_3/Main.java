package bookCodingTest.greedy.ex3_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        int [][] array = null;
        int result = 0;

        /* N 입력 부분 */
        System.out.println("행의 개수(N)를 입력해주세요. (1 <= N)");
        n = sc.nextInt();
        if( 1 > n ) {
            System.out.println("행의 개수(N)은 1이상 수로 입력해주세요.");
            return;
        }

        /* M 입력 부분 */
        System.out.println("열의 개수(M)을 입력해주세요. (M <= 100)");
        m = sc.nextInt();
        if(m > 100) {
            System.out.println("열의 개수(M)은 100이하인 수로 입력해주세요.");
            return;
        }


        /* 행렬 생성 부분 */
        array = new int[n][m];
        System.out.println("");
        System.out.println(n + " x " + m + " 크기의 행렬이 생성됩니다.");
        for(int x=0; x<n; x++) {
            for(int y=0; y<m; y++) {
                array[x][y] = (int)(Math.random()*10000)+1; // 1이상 10,000이하 난수 발생
                System.out.printf("%5d ", array[x][y]);
            }
            System.out.println("");
            System.out.println("");
        }

        /* Solution */
        long start_time = System.currentTimeMillis();
        result = solution(array);
        long end_time = System.currentTimeMillis();

        /* 결과 출력 */
        System.out.println("");
        System.out.println("@최종 결과 : " + result );
        System.out.println("@측정 시간 : " + (start_time - end_time)/1000.0);
    }

    /**
     * 각 행의 가장 작은 수 중 쿤 수 찾기
     * @param array
     * @return
     */
    public static int solution(int[][] array) {

        int [] minArray = new int[array.length];
        int min = 10001;

        for(int x=0; x<array.length; x++) {
            for(int y=0; y<array[x].length; y++) {
                if(min > array[x][y]) {
                    min = array[x][y];
                }
            }
            minArray[x] = min;
            System.out.println(x + "행 가장 작은 수 : " + min);
            min = 10001;
        }

        Arrays.sort(minArray);

        System.out.println("");
        System.out.println("작은 수 배열 ");
        System.out.print("[ ");
        for(int i=0; i<minArray.length; i++) {
            System.out.print(minArray[i] + " ");
        }
        System.out.print("]");

        return minArray[minArray.length-1];
    }
}
