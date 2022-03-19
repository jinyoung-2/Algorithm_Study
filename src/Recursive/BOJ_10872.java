package Recursive;

import java.util.Scanner;

// 백준 브론즈3 팩토리얼
//https://www.acmicpc.net/problem/10872
public class BOJ_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 1;

        // 핵심 로직
        answer = factorial(N,1);

        //출력
        System.out.println(answer);
    }
    static int factorial(int N,int sum){
        if(N==0||N==1){
            return 1;
        }
        sum *= factorial(N-1,sum);
        sum *= N;
        return sum;
    }
}
