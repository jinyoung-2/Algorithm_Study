package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ _ Bronze1 - 부녀회장이 될테야
// https://www.acmicpc.net/problem/2775
public class BOJ_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int maxFloor = 0;
        int maxRoom = 0;

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            if (maxFloor < k)
                maxFloor = k;
            if (maxRoom < n)
                maxRoom = n;
        }
        int[] result[] =  new int[maxFloor][maxRoom+1];
        for(int i=1;i<=maxRoom;i++){
            result[0][i] = i;
        }
        for(int i=1;i<=maxFloor;i++){
            for(int j=1;j<=maxRoom;j++){
                for(int k=1;i<=)
            }
        }
        for (int i = 0; i < T; i++) {
            // 해당 집에 거주민 수를 출력
            System.out.println();
        }

    }
}
