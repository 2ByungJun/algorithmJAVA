package programmers.cafe24.programming1;

/*
어느날 종이를 주웠는데

1
3 5 7
9 11 13 15 17
19 21 23 25 27 29 31
...
이런 식으로 노트에 적혀있었다고 합니다.

n 번째 줄을 입력 하였을 때, 그 줄의 마지막 3개 수의 합을 출력하는 프로그램을 작성하십시오.

입력 : 정수 n ( 2 ≤ n ≤ 1000 )

출력 : n번째 줄 마지막 3개 수의 합
 */

import java.util.Arrays;

public class Programming1 {
    public static void main(String[] args) {
        solution(3);
    }

    public static int solution(int n) {
        int answer = 0;
        int firstNum = 2*(n*n) - 4*n + 3;
        int count = 2*n - 1;

        int[] ints = new int[count];
        for(int i=0; i<count; i++){
            ints[i] = firstNum + 2*i;
        }
        int[] copyInts = Arrays.copyOfRange(ints, count-3, ints.length);

        for (int copyInt : copyInts) {
            answer += copyInt;
        }
        return answer;
    }
}
