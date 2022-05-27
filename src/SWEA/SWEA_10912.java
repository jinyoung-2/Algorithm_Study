package SWEA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SWEA_10912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc= 1; tc <= T; tc++) {
            char[] arr = br.readLine().toCharArray();
            StringBuilder ans = new StringBuilder();
            Arrays.sort(arr);
            boolean isAns[] = new boolean[arr.length];

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] == arr[j + 1]) {
                    isAns[j] = true;
                    isAns[j + 1] = true;
                    j++;
                }
            }

            boolean isPerfect = true;
            System.out.print("#" + tc + " ");
            for (int j = 0; j < arr.length; j++) {
                if (!isAns[j]) {
                    isPerfect = false;
                    ans.append(arr[j]);
                }
            }
            if (isPerfect)
                System.out.println("Good");
            else
                System.out.println(ans);
        }
    }
}
