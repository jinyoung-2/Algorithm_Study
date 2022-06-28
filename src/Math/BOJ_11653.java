package Math;

import java.io.*;

//https://www.acmicpc.net/problem/11653
public class BOJ_11653 {
    public static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        prime = new boolean[N + 1];

        get_prime();

        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]) {
                while (N % i == 0) {
                    N /= i;
                    sb.append(i).append("\n");
                }
            }
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
