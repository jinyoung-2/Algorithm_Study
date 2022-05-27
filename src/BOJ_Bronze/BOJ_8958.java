package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// O의 연속 개수만큼 점수를 누적하여 합산하고, X가 나오면 누적값은 0으로 초기화 된다.
public class BOJ_8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();

            int result = 0;
            int cnt = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == 'X') {
                    cnt = 0;
                } else {
                    cnt++;
                    result += cnt;
                }
            }
            System.out.println(result);
        }
    }
}
