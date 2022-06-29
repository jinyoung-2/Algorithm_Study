package Math;

import java.io.*;

//https://www.acmicpc.net/problem/11653
/**
 * 처음에는 소수를 구해야 한다고 생각했음
 * But, 따로 소수를 구해주지 않아도 됨
 */

public class BOJ_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        if(N==1)
            return ;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            while (N % i == 0) {
                sb.append(i).append("\n");
                N /= i;
            }
        }

        /*
        * 중요 Point) N /= i로 나누고 남은 최종 N이 2가지 case로 나뉨
        * Case 1) 최종 N이 1인 경우
        *       => 1이 인수분해되는 일이 없으므로 for문 또한 종료됨
        *       => 즉, 인수분해가 잘 종료됨
        *
        * Case 2) 최종 N이 1이 아닌 경우,
        *       => 최종 N이라는 인수를 갖고 있는데, for문의 조건식에 의해 출력되지 못하고 종료됨
        *       => 즉, N은 소수이자 인수인 것이 자명하기 때문에 한 번 더 출력해주는 조건문을 작성해야 함
        * */
        if(N!=1){
            sb.append(N).append("\n");
        }
        System.out.print(sb);
    }
}