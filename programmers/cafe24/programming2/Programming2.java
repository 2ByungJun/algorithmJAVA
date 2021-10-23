package programmers.cafe24.programming2;

/*
자신의 국어 수학 영어 3 과목의 시험 성적을 확인했습니다. 평균과 등급을 구할 수 있는 프로그램을 작성하십시오.

평균은 소수점 2 번째 자리까지만(3 번째 자리에서 반올림) 출력하며 등급은 평균 90점 이상일 경우 A, 90점 미만 80점 이상인 경우 B, 80점 미만 70점 이상이 C, 70점 미만 60점 이상이 D이고 60점 미만으로는 F입니다.

점수의 평균은 소수점 2번째 자리까지 표시하며, 리턴값은 모두 String 형식으로 반환합니다.

입력 : 국어 영어 수학 순으로 점수 입력(각 과목 당 100점 만점)

출력 : 평균, 등급
 */

import java.util.Arrays;

public class Programming2 {
    public static void main(String[] args) {
        int[] numArr = {50, 50, 50};
        solution(numArr);
    }

    public static String[] solution(int[] numArr) {
        String[] answer = {};
        int sum = 0;
        double avg = 0.0;
        String grade;

        for(int num : numArr){
            sum += num;
        }
        avg = (double)sum/numArr.length;

        if(90<= avg){
            grade = "A";
        }else if(80<=avg && avg<90){
            grade = "B";
        }else if(70<=avg && avg<80){
            grade = "C";
        }else if(60<=avg && avg<70){
            grade = "D";
        }else{
            grade = "F";
        }

        answer = new String[]{String.format( "%.2f" , avg), grade};

        return answer;
    }
}
