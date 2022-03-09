package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PG_체육복 {
    public static void main(String[] args) {
        /**
         * n: 전체학생수
         * 배열 lost: 체육복 도난당한 학생들 번호 담긴 배열
         * 배열 reserve: 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
         *
         * 핵심:     학생들의 번호는 체격 순으로 매겨짐
         *          바로 앞번호의 학생 or 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있음
         * return값: 체육수업을 들을 수 있는 학생의 최댓값
         * */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        int solveNum = 0;

        // 배열 lost와 reserve를 List로 변경
        Arrays.asList(lost);
        Arrays.asList(reserve);

        // Iterator 생성
        Iterable<Integer> iterable;

        while(iterable.iterator().hasNext()){
            if((iterable.iterator().next() ==reserve.)|| (iterable.iterator().next() = reserve. +1 )||(iterable.iterator().next() = reserve. -1 )){
                //reserve index 제거

                solveNum++;
            }

        }
        int answer = n - (lost.length-solveNum);
        System.out.println(answer);    //5출력
    }
}
