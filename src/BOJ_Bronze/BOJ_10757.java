package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

// BOJ _ Bronze5 - 큰 수 A+B
// https://www.acmicpc.net/problem/10757

// long 범위도 넘어감

// BufferedReader 입력방식 풀이
public class BOJ_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        System.out.println(a.add(b));
    }
}

//// Scanner 입력방식 풀이
//public class BOJ_10757 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BigInteger a = sc.nextBigInteger();
//        BigInteger b = sc.nextBigInteger();
//
//        System.out.println(a.add(b));
//    }
//}
