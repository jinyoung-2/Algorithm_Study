package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ _ Bronze2 - 문자열 반복
// https://www.acmicpc.net/problem/2675
public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String str = input[1];
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                for (int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}
