package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] alpha = new int[26];
        for (int i = 0; i < 26; i++) {
            alpha[i] = -1;
        }

        String S = br.readLine();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == ch) {
                    alpha[ch - 'a'] = i;
                    break;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
    }
}
