package programmers.cafe24.programming3;

/*
주어진 둘레의 길이로 만들 수 있는 삼각형의 개수를 구하는 프로그램을 작성하십시오.

예를 들어 삼각형의 둘레의 길이가 9m라고 하면,

한 변의 길이가 1m, 두 변의 길이가 4m인 삼각형

한 변의 길이가 2m, 다른 변의 길이가 3m, 나머지 변의 길이가 4m인 삼각형

세 변의 길이가 모두 3m인 삼각형

총 3가지 삼각형을 만들 수 있습니다.

입력 : 삼각형 둘레의 길이( 1이상 100이하 )

출력 : 만들어질 수 있는 서로 다른 삼각형의 수
 */

public class Programming3 {
    public static void main(String[] args) {
        solution(100);
    }

    public static int solution(int size) {
        int answer = 0;

        for(int x=1; x<=size/3; x++){
            for(int y=(size-x)/2; y>=x; y--){
                int z = size-x-y;
                if(z<x+y){
                    answer++;
                }
            }
        }

        System.out.println(answer);
        return answer;
    }
}
