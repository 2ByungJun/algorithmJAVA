package programmers.naverFinancial.programming1;

/*
XX 페이를 이용해서 물품을 구매한 고객들에게 10% 할인 쿠폰을 지급하려 합니다.
쿠폰을 지급하는 방법은 다음과 같습니다.

물품을 구매한 고객은 하루에 최대 1장씩 할인 쿠폰을 받습니다.
고객 한 명당 최대 k 장까지 할인 쿠폰을 받을 수 있습니다.

예를 들어 고객 한 명당 k = 2장까지 할인 쿠폰을 받을 수 있고,
A 고객이 3일 동안 매일 물건을 구매했다면,
이 고객은 할인 쿠폰을 두 장 받습니다.

각 날짜별로 XX 페이를 이용해 물품을 구매한
고객들의 ID가 문자열 형태로 담긴 배열 id_list,
고객 한 명당 받을 수 있는 최대 쿠폰 수 k가 매개변수로 주어질 때,
고객들에게 지급된 쿠폰은 모두 몇 장인지 return 하도록 solution 함수를 완성해주세요.
 */

import java.util.Arrays;
import java.util.HashMap;

public class Programming1 {
    public static void main(String[] args) {
        String[] id_list = {"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"};
        solution(id_list, 3);
    }

    public static int solution(String[] id_list, int k) {
        int answer = 0; // 지급된 쿠폰
        HashMap<String, Integer> id_map = new HashMap<String, Integer>(){};

        for(int i=0; i<id_list.length; i++){
            String[] str = id_list[i].split(" ");
            String[] today_id_list = Arrays.stream(str).distinct().toArray(String[]::new);

            for (String id: today_id_list ) {
                if(id_map.containsKey(id)){
                    id_map.put(id, id_map.get(id) + 1 );
                }else{
                    id_map.put(id, 1);
                }
            }
        }

        for( String key : id_map.keySet() ){
            int value = id_map.get(key);

            if(value > k){
                answer += k;
            }else{
                answer += value;
            }
        }

        return answer;
    }
}
