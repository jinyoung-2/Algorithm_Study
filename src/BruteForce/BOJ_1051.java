package BruteForce;

import java.util.Scanner;

// 백준 실버3 "숫자 정사각형"
// https://www.acmicpc.net/problem/1051
public class BOJ_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //가로
        int M = sc.nextInt();   //세로
        int[] arr[] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 꼭짓점에 쓰여 있는 수가 모두 같은 가장 큰 정사각형 찾기
        int maxSize = 1;    // 0으로 두면 안 됨. 1*1은 가장 작은 정사각형이므로, 최소 정사각형 크기가 1 이상임
        int a = 2;
        int b = Math.min(N,M);
        for (int i=a;i<=b;i++){ //정사각형 한 변의 길이의 범위 => 2<=i<=Math.min(N,M)
            for(int j=0;j<=M-i;j++){ //세로
                for(int k=0;k<=N-i;k++){ //가로
                    if(arr[j][k]==arr[j][k+i-1]){
                        if(arr[j][k]==arr[j+i-1][k]){
                            if(arr[j][k]==arr[j+i-1][k+i-1]){
                                maxSize = i;
                            }
                        }

                    }
                }
            }
        }
        // 출력
        System.out.println(maxSize*maxSize);
    }
}
