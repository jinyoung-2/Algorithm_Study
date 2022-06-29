package Math;

import java.io.*;

public class BOJ_4948 {
    public static boolean[] prime = new boolean[123456 * 2 + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // n <= 적어도 하나 이상의 소수 존재 <= 2n
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {

            get_prime();

            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (!prime[i]) {
                    cnt++;
                }
            }
            sb.append(cnt).append("\n");

            n = Integer.parseInt(br.readLine());
        }
        System.out.print(sb);
    }

    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
