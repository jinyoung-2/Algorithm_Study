package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_3977 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        for (int m = 1; m <= tc; m++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for (int i = min; i < max; i++) {
                // 4로 나눈 나머지가 1인 숫자
                if (i % 4 != 1)
                    continue;

                // 소수 찾기
                boolean isBreakFisrt = false;
                for (int j = 2; j < i / 2; j++) {
                    if (i % j == 0) {
                        isBreakFisrt = true;
                        break;
                    }
                }
                if (isBreakFisrt)
                    continue;

                // 두 제곱수의 합 찾기
                boolean isBreakSecond = false;
                for (int j = 1; j <= i - 1; j++) {
                    for (int k = j + 1; k <= i; k++) {
                        if (i == j * j + k * k) {
                            cnt++;
                            isBreakSecond = true;
                        } else if (i < j * j + k * k)
                            break;
                    }
                    if (isBreakSecond)
                        break;
                }
            }
            System.out.println("#" + m + " " + cnt);
        }
    }
}
