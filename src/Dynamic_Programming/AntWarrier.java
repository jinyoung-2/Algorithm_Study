package Dynamic_Programming;

import java.util.Scanner;

// 참고
// https://www.youtube.com/watch?v=5Lu34WIx2Us

// 개미 전사 문제
public class AntWarrier {
    // 앞서 계산된 결과를 저장하기 위한 DP 테이블 초기화
    public static int[] d = new int[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 N 입력받기
        int N = sc.nextInt();   //식량창고 개수

        // 모든 식량 정보 입력받기
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // 다이나믹 프로그래밍(Dynamic Programming) 진행 (보텀업)
        d[0] = arr[0];
        d[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < N; i++) {
            d[i] = Math.max(d[i - 1], d[i - 2] + arr[i]);
        }
        // 계산된 결과 출력
        System.out.println(d[N - 1]);
    }
}
