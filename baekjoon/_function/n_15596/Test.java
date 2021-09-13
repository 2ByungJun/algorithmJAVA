package baekjoon._function.n_15596;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11};
        System.out.println(sum(a));
    }

    static long sum(int[] a){
        return (long)Arrays.stream(a).sum();
    }

}
/** 아래 주석부분이 정답이다. 문제가 별로라고 생각이 든다. **/
/*
class Test {
    long sum(int[] a){
        long sum = 0;

        for(int i=0; i<a.length; i++){
            sum += a[i];
        }

        return sum;
    }
}
*/
