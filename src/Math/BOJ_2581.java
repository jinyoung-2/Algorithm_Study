package Math;

import java.io.*;

// 소수 - 실버 5
// https://www.acmicpc.net/problem/2581
public class BOJ_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = 0;

        // M <= 소수 <= N
        for (int num = M; num <= N; num++) {

            // 아랫부분을 작성하지 않아서 오류 발생함
            if(num==1){
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (min == 0) {
                    min = num;
                }
                sum += num;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        // 소수의 합
        System.out.println(sum);
        // 소수 중 최솟값
        System.out.println(min);
    }
}
