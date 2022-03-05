package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
        timeList.add(sc.nextInt());

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
            total_time += wait_time;
        }
        System.out.println(total_time);
    }
}
