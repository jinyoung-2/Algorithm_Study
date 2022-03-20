package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 실버3 "숫자 정사각형"
// https://www.acmicpc.net/problem/1051

/**
 * 이 문제는 모든 경우의 수를 다 조사하는 문제이므로, 시간 복잡도를 고려해봐야 한다.
 * 최대 길이가 50이므로 50 50일 때 size를 50으로 지정하게 된다. 따라서 50*50*50이므로 10억*3을 초과하지 않아 시간이 충분하다.
 * for문을 돌려서 각 꼭지점 위치의 값이 동일하면, ans에 값을 저장한다.
 * */
public class BOJ_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());    //Q. StringTokenizer st = new StringTokenizer(br.readLine()," ");와 동일한 코드인가요?
                                                                    //A. Yes. 2번째 인자의 default는 "공백"이다.
        int N = Integer.parseInt(st.nextToken());   //세로
        int M = Integer.parseInt(st.nextToken());   //가로

        int[] arr[] = new int[N][M];
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = input.charAt(i) - '0';    //문자를 숫자로 변환하는 방법 알아두기!
            }
        }

        // 꼭짓점에 쓰여 있는 수가 모두 같은 가장 큰 정사각형 찾기
        int ans = 1;    // 0으로 두면 안 됨. 1*1은 가장 작은 정사각형이므로, 최소 정사각형 크기가 1 이상임
        int size = Math.min(N, M);
        for (int k = 2; k <= size; k++) { //정사각형 한 변의 길이의 범위 => 2<=i<=Math.min(N,M)
            for (int i = 0; i <= N - k; i++) { //세로
                for (int j = 0; j <= M - k; j++) { //가로
                    if (arr[i][j] == arr[i + k - 1][j] && arr[i][j] == arr[i][j + k - 1] && arr[i][j] == arr[i + k - 1][j + k - 1]){
                        if(ans<k){
                            ans=k;
                        }
                    }
                }
            }
        }
        // 출력
        System.out.println(ans * ans);
    }
}
