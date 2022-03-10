package Greedy;

public class PG_체육복 {
    public static int main(String[] args) {
        /**
         * n: 전체학생수
         * 배열 lost: 체육복 도난당한 학생들 번호 담긴 배열
         * 배열 reserve: 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
         *
         * 핵심:     학생들의 번호는 체격 순으로 매겨짐
         *          바로 앞번호의 학생 or 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음
         * return값: 체육수업을 들을 수 있는 학생의 최댓값
         * */

        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int solveNum = 0;

        int lostIdx = 0;
        int reserveIdx = 0;
        int cnt = 0;

        // 예외상황 고려해보기!
        while(lostIdx < lost.length && reserveIdx < reserve.length){
            if(lost[lostIdx] > reserve[reserveIdx] + 1){
                reserveIdx++;
            }
            else if(lost[lostIdx] < reserve[reserveIdx] - 1){
                lostIdx++;
            }
            else{
                if(lost[lostIdx] == reserve[reserveIdx]){
                    cnt++;
                    lostIdx++;
                    reserveIdx++;
                }
                else if(lost[lostIdx] == reserve[reserveIdx] + 1 || lost[lostIdx] == reserve[reserveIdx] -1){
                    cnt++;
                    lostIdx++;
                    reserveIdx++;
                }
            }
        }
        return n-lost.length+cnt;
    }
}
