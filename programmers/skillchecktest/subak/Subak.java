package programmers.skillchecktest.subak;

public class Subak {
    public static void main(String[] args) {
        int n = 3;

        solution(n);
    }

    public static String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++){
            if ((i % 2) != 0) {
                answer = answer + "수";
            } else {
                answer = answer + "박";
            }
        }

        System.out.println(answer);

        return answer;
    }
}
