package bookCodingTest.greedy.ex3_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 4, 6}; // 배열
        int plusNum = 8;  	// 더하는 횟수
        int indexNum = 3; 	// 연속되는 인덱스 수

        long start_time = System.currentTimeMillis(); // 측정시작
        System.out.println("@출력결과 : " + solution(array, plusNum, indexNum));
        long end_time = System.currentTimeMillis(); // 측정종료

        System.out.println("@측정시간 : " + (end_time - start_time)/1000.0);
    }

    public static int solution(int[] array, int plusNum, int indexNum) {
        int result = 0;

        Arrays.sort(array); // 2, 4, 4, 5, 6

        int firstMaxNum = array[array.length-1];
        int secondMaxNum = array[array.length-2];

        while(true) {
            // 연속되는 인덱스 수 만큼 가장 큰 수를 더함
            for(int i=0; i<indexNum; i++) {
                // 더하는 횟수가 0이면 탈출
                if(plusNum == 0) break;

                result += firstMaxNum;	// 제일 큰 수를 한 번 더함
                plusNum--; 				// 더한횟수 감소
            }
            result += secondMaxNum; // 두번째로 큰 수를 한 번 더함
            plusNum--;				// 더한횟수 감소
            // 더하는 횟수가 0이면 탈출
            if(plusNum == 0) break;
        }

        return result;
    }
}
