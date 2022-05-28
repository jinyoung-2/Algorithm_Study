package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        // 완전 제곱수 찾기
        int sqrtFirstNum = (int) Math.ceil(Math.sqrt(M));
        int sqrtSecondNum = (int) Math.floor(Math.sqrt(N));
        if (sqrtFirstNum > sqrtSecondNum) {
            System.out.println(-1);
            return;
        }

        int sum = 0;
        for (int i = sqrtFirstNum; i <= sqrtSecondNum; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println(sum);
        System.out.println(sqrtFirstNum * sqrtFirstNum);    //min값 출력
    }
}
