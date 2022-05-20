package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ _ Bronze2 - 다이얼
// https://www.acmicpc.net/problem/5622
public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int cnt = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case 'A':
                case 'B':
                case 'C':
                    cnt += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    cnt += 4;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    cnt += 5;
                    break;
                case 'J':
                case 'K':
                case 'L':
                    cnt += 6;
                    break;
                case 'M':
                case 'N':
                case 'O':
                    cnt += 7;
                    break;
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    cnt += 8;
                    break;
                case 'T':
                case 'U':
                case 'V':
                    cnt += 9;
                    break;
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    cnt += 10;
                    break;
            }
        }
        System.out.println(cnt);
    }
}
