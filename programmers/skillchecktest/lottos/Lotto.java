package programmers.skillchecktest.lottos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lotto {
    public static void main(String[] args) {

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        solution(lottos, win_nums);
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int matched = 0;
        int zero = 0;

        List<Integer> lottoList = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        List<Integer> win_nums_list = Arrays.stream(win_nums).boxed().collect(Collectors.toList());

        for (Integer integer : lottoList) {
            if (integer == 0) {
                zero++;
            }
        }

        for (Integer integer : lottoList) {
            if(win_nums_list.contains(integer)) {
                matched++;
            }
        }

        System.out.println(matched);
        System.out.println(zero);

        answer= new int[]{matched + zero, matched};

        for(int j=0; j<2; j++){
            switch (answer[j]){
                case 6:
                    answer[j] = 1;
                    break;
                case 5:
                    answer[j] = 2;
                    break;
                case 4:
                    answer[j] = 3;
                    break;
                case 3:
                    answer[j] = 4;
                    break;
                case 2:
                    answer[j] = 5;
                    break;
                default:
                    answer[j] = 6;
                    break;
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
