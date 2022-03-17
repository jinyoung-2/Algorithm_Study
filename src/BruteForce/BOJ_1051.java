package BruteForce;

import java.util.Scanner;

// 백준 실버3 "숫자 정사각형"
// https://www.acmicpc.net/problem/1051
public class BOJ_1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr[] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // 꼭짓점에 쓰여 있는 수가 모두 같은 가장 큰 정사각형 찾기
        int maxSize = 1;
        int a = 2;
        int b = Math.min(N,M);
        for (int i=a;i<=b;i++){
            for(int j=0;j<M-i;j++){
                for(int k=0;k<N-i;k++){
                    if(arr[j][k]==arr[j][k+i]){
                        if(arr[j][k]==arr[j+i][k]){
                            if(arr[j][k]==arr[j+i][k+i]){
//                                maxSize = arr[j][k];
                                if(maxSize<i)
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
