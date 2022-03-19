package Recursive;

import java.util.Scanner;

// 백준 브론즈2  피보나치 수 5
// https://www.acmicpc.net/problem/10870
public class BOJ_10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer=fibo(n);
        System.out.println(answer);
    }

    static int fibo(int n){
        if(n==0||n==1)
            return n;
        return fibo(n-1)+fibo(n-2);
    }
}
