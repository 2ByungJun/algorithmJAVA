package baekjoon._function.n_4673;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        selfNumber();
    }

    static void selfNumber(){
        ArrayList<Integer> list = new ArrayList<>(10000);
        for(int i=1; i<=10000; i++){
            list.add(i);
        }

        for(int j=0; j<=10000; j++){
            int temp = j;
            int result = 0;
            while(temp != 0){
                result += (temp%10);
                temp /= 10;
            }
            result += j;

            list.remove(Integer.valueOf(result));
        }

        for(int z=0; z<list.size(); z++){
            System.out.println(list.get(z));
        }
    }
}
