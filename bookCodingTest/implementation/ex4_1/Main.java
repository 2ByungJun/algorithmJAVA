package bookCodingTest.implementation.ex4_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /* 행렬 크기 설정 */
        int n = 0; // 행렬의 크기
        System.out.println("행렬의 크기를 입력해주세요. (1~100사이)");
        n = sc.nextInt();

        if(1 > n || n > 100) {
            System.out.println("행렬의 크기가 올바르지 않습니다.");
            return;
        }


        /* 움직임을 담을 배열 생성 */
        ArrayList<String> moveList = new ArrayList<String>(); // 0 < array < 101
        int i = 0;
        while(i <= 100) {
            System.out.print("이동경로를 입력하세요.(L,R,U,D / E = 입력종료) = ");
            String s = sc.next();

            if(s.equals("L") || s.equals("R") || s.equals("U") || s.equals("D")) {
                moveList.add(s);

                if(i > 100) {
                    System.out.println("100회 이상이 입력되었습니다. 입력값으로 진행됩니다.");
                }

                i++;
            }else if(s.equals("E")){
                break;
            }else {
                System.out.println("L, R, U, D, E만 입력할 수 있습니다.");
                continue;
            }

        }
        System.out.print("입력 값 : [ ");
        for(int j=0; j<moveList.size(); j++ ) {
            System.out.printf("%s ", moveList.get(j) );
        }
        System.out.println("]");

        solution(n, moveList);

    }

    public static void solution(int n, ArrayList<String> moveList ) {
        int x = 1;
        int y = 1;

        /* 이동계산 */
        for(int i=0; i<moveList.size(); i++) {
            switch(moveList.get(i)) {
                case "L":
                    if(y > 1) {
                        y -= 1;
                    }
                    break;
                case "R":
                    if(y < n) {
                        y += 1;
                    }
                    break;
                case "U":
                    if(x > 1) {
                        x -= 1;
                    }
                    break;
                case "D":
                    if(x < n) {
                        x += 1;
                    }
                    break;
            }
        }

        System.out.printf("최종 결과 : ( %d, %d )", x, y);
    }
}
