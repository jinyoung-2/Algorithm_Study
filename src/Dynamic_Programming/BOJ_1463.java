package Dynamic_Programming;

import java.io.IOException;
import java.util.Scanner;

// 백준 실버3 1로 만들기
// https://www.acmicpc.net/problem/1463
public class BOJ_1463 {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        dp = new int[X];
        System.out.println(make1(X));
    }

    static int make1(int x) {
        if (x == 1)
            return 0;
        if (dp[x] != 0)
            return dp[x];

        int r1 = Integer.MAX_VALUE;
        int r2 = Integer.MAX_VALUE;
        int r3 = Integer.MAX_VALUE;

        if (x % 3 == 0) {
            r1 = make1(x / 3) + 1;
        }
        if (x % 3 == 0) {
            r2 = make1(x / 2) + 1;
        }
        r3 = make1(x - 1) + 1;
        return dp[x] = Math.min(r1, Math.min(r2, r3));
    }
}
