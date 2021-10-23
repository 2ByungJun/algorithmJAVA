package programmers.cafe24.programming4;

/*
입력된 숫자가 홀수인지 짝수인지를 판별하는 것이 목표입니다. 홀수인 경우 "홀", 짝수인 경우 "짝"을 리턴하는
프로그램을 작성하십시오.

입력 : 자연수 입력

출력 : 홀수일 경우 홀, 짝수일 경우 짝 출력
 */

public class Programming4 {
    public static void main(String[] args) {
        solution(15);
    }

    public static String solution(int num) {
        String answer = "";

        if(num%2!=0){
            answer = "홀";
        }else{
            answer = "짝";
        }

        System.out.println(answer);

        return answer;
    }

}
