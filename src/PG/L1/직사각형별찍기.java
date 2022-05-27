package PG.L1;

import java.util.Scanner;

public class 직사각형별찍기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++)
            sb.append("*");

        for(int i=0;i<m;i++)
            System.out.println(sb);
    }
}
