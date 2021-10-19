package programmers.skillchecktest.runner;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        solution(participant , completion);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        System.out.println(Arrays.toString(participant));
        System.out.println(Arrays.toString(completion));

        for(int i=0; i<participant.length; i++){
            if(i != participant.length-1 ){
                if( !participant[i].equals(completion[i]) ){
                    answer =  participant[i];
                    i = participant.length-1;
                }
            }else{
                answer =  participant[i];
            }
        }

        System.out.println(answer);

        return answer;
    }
}
