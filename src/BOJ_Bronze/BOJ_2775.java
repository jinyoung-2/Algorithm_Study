package BOJ_Bronze;

import java.io.*;

// BOJ _ Bronze1 - 부녀회장이 될테야
// https://www.acmicpc.net/problem/2775
public class BOJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int k = Integer.parseInt(br.readLine());    //층 ex)1층
            int n = Integer.parseInt(br.readLine());    //호 ex)3호

            int[] arr[] = new int[k + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                arr[0][i] = i;    //0층의 i호에는 i명이 산다
            }

            for (int i = 1; i <= k; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int m = 1; m <= j; m++) {
                        arr[i][j] += arr[i - 1][m];
                    }
                }
            }

            // 해당 집에 거주민 수 출력
            System.out.println(arr[k][n]);
        }
    }
}
