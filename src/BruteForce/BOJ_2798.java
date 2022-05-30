package BruteForce;

import java.io.*;
import java.util.*;

// 블랙잭
// https://www.acmicpc.net/problem/2798
public class BOJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int max = 0;
//        int max = Integer.MIN_VALUE;  // max 초기값을 이 값으로 설정시, line23애서 overflow가 발생한다.
        for (int i = 0; i <= N - 3; i++) {
            for (int j = i + 1; j <= N - 2; j++) {
                for (int k = j + 1; k <= N - 1; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= M) {
                        if ((M - max) > (M - sum)) {
                            max = sum;
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}