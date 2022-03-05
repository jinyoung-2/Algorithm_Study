package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 방법 1. ArrayList 사용
public class BJ_11399 {
    public static void main(String[] args) {
        /**
         * ATM 앞에 N명의 사람 서있음
         * i번 사람이 돈을 인출하는데 걸리는 시간은 Pi분
         *
         * 사람들이 줄을 서는 순서에 따라, 돈을 인출하는데 필요한 시간의 합이 달라짐
         * 구하는 것: 각 사람이 돈 인출하는데 필요한 시간의 합의 최소값
         */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    //사람 수
        List<Integer> timeList = new ArrayList<>(); //걸리는 시간
        for(int i=0;i<N;i++){
            timeList.add(sc.nextInt());             //
        }

        /**
         * 문제 풀이 아이디어
            : 인출시 필요한 시간이 최소인 사람부터 선택해야 함
            => 오름차순으로 정렬 => List 자료구조 이용
         */
        int total_time = 0;    //필요한 시간합의 최소값
        int wait_time = 0;

        Collections.sort(timeList);    //정렬
        for(int i=0;i<N;i++){
//            min += timeList.get(i) * (N-i);
            wait_time += timeList.get(i);       //ERROR: Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
                                                //문제: Line20 코드를 N만큼 반복 안 돌렸음
            total_time += wait_time;
        }
        System.out.println(total_time);
    }
}

// 방법 2. Array 사용
public class BJ_11399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();    //사람 수
        int[] timeArray = new int[N];
        for(int i=0;i<N;i++){
            timeArray[i] = sc.nextInt();
        }
        
        Arrays.sort(timeArray); //배열 정렬하는 법

        int min = 0;
        for(int i=0;i<N;i++){
            min += timeArray[i] * (N-i);
        }
        System.out.println(min);
    }
}

// 아래부터는 검색한 풀이
// 방법 3. Scanner + Counting Sort
public class BJ_11399 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // 입력의 범위는 1 ~ 1000이므로 1001개의 index를 둔다.
        int[] arr = new int[1001];

        // Counting Sort
        while (N-- > 0) {
            arr[in.nextInt()]++;
        }

        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for (int i = 0; i < 1001; i++) {

            // 해당 i index가 0이 될 때 까지 반복     // Q. 이 부분부터 이해가 안 돼!
            while (arr[i]-- > 0) {
                // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
                sum += (i + prev);

                // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
                prev += i;
            }
        }
        System.out.println(sum);
    }

}

// 방법 4. BufferedReader + Counting Sort
public class BJ_11399 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 입력의 범위는 1 ~ 1000이므로 1001개의 index를 둔다.
        int[] arr = new int[1001];

        // Counting Sort
        while (N-- > 0) {
            arr[Integer.parseInt(st.nextToken())]++;
        }

        int prev = 0;	// 이전까지의 대기시간 누적합
        int sum = 0;	// 사람별 대기시간 총합

        for (int i = 0; i < 1001; i++) {

            // 해당 i index가 0이 될 때 까지 반복     // Q. 이 부분부터 이해가 안 돼!
            while (arr[i]-- > 0) {
                // 이전까지의 대기시간과 현재 사람이 걸리는 시간을 더해준다.
                sum += (i + prev);

                // 이전까지의 누적합에 현재 걸리는 시간을 더해준다.
                prev += i;
            }
        }
        System.out.println(sum);
    }

}