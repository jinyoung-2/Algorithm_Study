package BOJ_Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// BOJ _ Bronze5 - 1998년생인 내가 태국에서는 2541년생?!
public class BOJ_18108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputYear = Integer.parseInt(br.readLine());

        System.out.println(inputYear-543);
    }
}
