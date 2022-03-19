package Recursive;

import java.util.Scanner;

// 백준 브론즈3 팩토리얼
//https://www.acmicpc.net/problem/10872

// 1. 재귀함수 풀이
public class BOJ_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 핵심 로직
        int answer = factorial(N);

        //출력
        System.out.println(answer);
    }

    public static int factorial(int N) {
        if (N <= 1) {   //재귀함수 종료조건
            return 1;
        }
        return N * factorial(N - 1);
    }
}

// 2. 반복문 풀이
//public class BOJ_10872 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//        // 핵심 로직
//        int answer = 1;
//
//        // N이 0이 아닐때까지 1씩 감소하면서 answer에 반복적으로 곱해준다.
//        while (N != 0) {
//            answer *= N;
//            N--;
//        }
//        //출력
//        System.out.println(answer);
//    }
//}

/**
 * 참고로 0!=1이다.
 * 참고로 N 의 범위가 0 ~ 12 이기 때문에 int 로도 가능하지만, 13 을 넘어가면 13! = 6227020800 으로 int 형의 범위를 벗어나기 때문에 long 타입으로 해주어야 한다.
     => 이렇게 입력받는 범위를 잘 보고 풀어야한다.
 */