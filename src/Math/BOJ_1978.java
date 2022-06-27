package BOJ_Silver;

import java.io.*;
import java.util.Arrays;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1)
                continue;
            boolean isBreak = false;
            for (int j = 2; j <= arr[i] / 2; j++) {     //조건식에서 등호가 없으면 틀렸다고 에러뜸!! check 필요!!
                if (arr[i] % j == 0) {
                    isBreak = true;
                    break;
                }
            }
            if (!isBreak)
                cnt++;
        }
        System.out.println(cnt);
    }
}
