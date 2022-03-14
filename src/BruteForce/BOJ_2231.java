package BruteForce;

// 백준 브론즈2 분해합
// https://www.acmicpc.net/problem/2231

import java.util.Scanner;

public class BOJ_2231 {
    public static void main(String[] args) {

        /**
         * 자연수 N이 주어질 때, N의 가장 작은 생성자 구하는 프로그램 작성
         * 어떤 자연수의 경우에는 생성자 X
         * 반대로, 생성자가 여러 개인 자연수의 경우, 가장 작은 생성자 구하기
         * */

        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int size = String.valueOf(N).length();  //N의 자리수를 구하기 위한 코드
        int start = N - (9 * size); //시작 최솟값 구하기
        int answer = 0;

        for (int i = start; i < N; i++) {
            int number = i; //한 자리씩 구하기 위한,,,
            int sum = 0;    //합

            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }

            if (sum + i == N) {
                answer = i;
                break;
            }
        }

        // 출력
        System.out.println(answer);
    }
}

/**
 * 처음에 문제를 잘못 이해했다.
 * -> 216의 분해합은 216+2+1+6=225인데 왜 198이 출력인지 이해가 되지 않았다.
 * <p>
 * 올바르게 문제를 이해하면,,,
 * 특정 숫자 M의 분해합 = N인 경우를 찾는 문제인 것이다.
 * <p>
 * 브루트포스 문제이므로, 작은 수부터 가능한 수를 모두 분해합해보면 된다.
 * N의 범위는 1~1,000,000이므로, 1~1,000,000-1까지의 수를 모두 분해합해보면 된다.
 * <p>
 * 그러나, N의 범위만큼 다 분해합을 할 필요가 없다.
 * 분해합으로 N을 만들 수 있는 범위를 생각해보면
 * 분해합 N = M +(M의 각 자리수의 합)이므로, M = N - (M의 각 자리수의 합)이 된다.
 * 따라서 각 자리수의 최댓값은 9이므로 9*자릿수를 빼주는 것으로 최솟값을 구할 수 있다.
 * 최댓값은 N이다. 분해합으로 N을 만들고자 할 때 N보다 큰 값은 절대 분해합으로 N을 만들 수 없다.
 */
// 참고: https://dundung.tistory.com/99