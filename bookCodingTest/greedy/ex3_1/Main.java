package bookCodingTest.greedy.ex3_1;

public class Main {
    public static void main(String[] args) {

        int change = 780;  // 거스름돈
        int[] won = {500, 100, 50, 10};  // 동전

        long start = System.currentTimeMillis(); // 측정시작
        System.out.println("@동전 총 개수 : " + solution(change, won));
        long end = System.currentTimeMillis();	 // 측정종료

        System.out.println("@코드 실행시간 : " + (end - start)/1000.0);
    }

    public static int solution(int change, int[] won) {
        int count = 0; // 동전 총 개수
        for (int j : won) {
            int wonNum = change / j; // 필요동전 개수
            change -= j * wonNum;      // 동전 개수만큼 차감
            count += wonNum;              // 동전 개수 더함
            System.out.println(j + "원은 " + wonNum + "개가 필요합니다.(남은잔액 : " + change + ")");
        }

        return count;
    }
}
