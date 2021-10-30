package programmers.naverFinancial.programming3;

/*
온라인으로 시험을 보는 프로그래밍 학원이 있습니다.
모든 시험 문제는 프로그램에 의해 자동으로 채점되며, 부분점수가 부여됩니다.
채점은 답안 제출과 동시에 실시간으로 이루어지며, 채점 로그가 시험 관리자에게 전달됩니다.
관리자는 시험이 모두 끝난 후 채점 로그를 통해 부정행위자로 의심되는 사람들을 찾아내려고 합니다.
이를 위해 다음과 같은 조건을 정했습니다.

1. 두 수험자가 푼 문제 수가 같다. 단, 푼 문제 수가 5 미만인 경우는 제외한다.
2. 두 수험자가 푼 문제의 번호가 모두 같다.
3. 두 수험자가 푼 문제의 점수가 모두 같다.

임의의 두 수험자가 위 3가지 조건에 모두 부합하는 경우, 두 수험자를 부정행위자로 의심합니다.

수험자의 수험번호, 문제 번호, 받은 점수를 나타내는 문자열 배열 logs가 매개변수로 주어집니다.
위 조건에 해당하는 모든 부정행위 의심자의 수험번호를 배열에 담아 사전 순으로 정렬하여 return 하도록
solution 함수를 완성해주세요.
단, 부정행위자로 의심되는 수험자가 없는 경우에는 문자열 "None"을 배열에 담아 return 해주세요.
 */

import java.util.*;

public class Programming3 {
    public static void main(String[] args) {
        String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
        solution(logs);
    }

    public static String[] solution(String[] logs) {
        String[] answer = {};
        List<ProblemVO> problemList = new ArrayList<>();
        HashMap<String, List<Integer>> problem = new HashMap<String, List<Integer>>(){};
        HashMap<String, List<Integer>> score = new HashMap<String, List<Integer>>(){};

        // set
        for(String log : logs){
            String[] student = log.split(" ");
            ProblemVO problemVO = new ProblemVO();
            problemVO.setId(student[0]);

            List<Integer> ints;
            if( problem.containsKey(problemVO.getId())){
                ints = problem.get(problemVO.getId());
            }else{
                ints = new ArrayList<>();
            }
            ints.add(Integer.parseInt(student[1]));
            problem.put(problemVO.getId(), ints);

            if( score.containsKey(problemVO.getId())){
                ints = score.get(problemVO.getId());
            }else{
                ints = new ArrayList<>();
            }
            ints.add(Integer.parseInt(student[2]));
            score.put(problemVO.getId(), ints);

            problemVO.setProblem(problem.get(problemVO.getId()));
            problemVO.setScore(score.get(problemVO.getId()));

            problemList.add(problemVO);
        }

        HashSet<ProblemVO> hashSet = new HashSet<>();
        for(ProblemVO vo : problemList){
            hashSet.add(vo);
        }

        for (ProblemVO vo : hashSet) {
            System.out.println("===============");
            System.out.println(vo.getId());
            System.out.println(Arrays.toString(vo.problem.toArray()));
            System.out.println(Arrays.toString(vo.score.toArray()));
        }

        return answer;
    }

    static class ProblemVO{
        private String id;
        private List<Integer> problem;
        private List<Integer> score;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public List<Integer> getProblem() {
            return problem;
        }

        public void setProblem(List<Integer> problem) {
            this.problem = problem;
        }

        public List<Integer> getScore() {
            return score;
        }

        public void setScore(List<Integer> score) {
            this.score = score;
        }

    }
}
