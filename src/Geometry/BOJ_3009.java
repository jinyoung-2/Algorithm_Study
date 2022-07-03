package Geometry;

import java.io.*;
import java.util.StringTokenizer;

// 네 번째 점 / Bronze 3
// https://www.acmicpc.net/status?user_id=brenda524&problem_id=3009&from_mine=1
public class BOJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] cord[] = new int[3][2];
        int width = 0;  //가로
        int height = 0; //세로

        for (int i = 0; i < cord.length; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            cord[i][0] = Integer.parseInt(st.nextToken());
            cord[i][1] = Integer.parseInt(st.nextToken());
        }

        // Solution: 쌍을 이루지 않는 각각의 좌표 찾기
        int ansX = 0;
        int ansY = 0;
        int i = 0;
        if (cord[i][0] == cord[i + 1][0]) {
            ansX = cord[i + 2][0];
            if (cord[i][1] == cord[i + 2][1]) {
                ansY = cord[i + 1][1];
            } else {   //1,2
                ansY = cord[i][1];
            }
        } else if (cord[i][0] == cord[i + 2][0]) {
            ansX = cord[i + 1][0];
            if (cord[i][1] == cord[i + 1][1]) {
                ansY = cord[i + 2][1];
            } else {   //1,2
                ansY = cord[i][1];
            }
        } else if (cord[i + 1][0] == cord[i + 2][0]) {
            ansX = cord[i][0];
            if (cord[i + 1][1] == cord[i][1]) {
                ansY = cord[i + 2][1];
            } else {   //0,2
                ansY = cord[i + 1][1];
            }
        }
        System.out.println(ansX + " " + ansY);
    }
}
