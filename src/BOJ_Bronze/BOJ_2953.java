package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int winner = -1;
        int winScore = 0;
        for (int i = 1; i <= 5; i++) {
            int personalScore = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()){
                personalScore += Integer.parseInt(st.nextToken());
            }

            if (winScore < personalScore) {
                winner = i;
                winScore = personalScore;
            }
        }
        System.out.println(winner + " " + winScore);
    }
}
