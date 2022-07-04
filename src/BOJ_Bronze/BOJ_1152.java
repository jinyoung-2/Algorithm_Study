package BOJ_Bronze;

import java.io.*;
import java.util.StringTokenizer;

// 단어의 개수 - Bronze 2
// https://www.acmicpc.net/problem/1152
public class BOJ_1152 {

    // stringTokenizer 방식
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.countTokens());
    }

//    // split 방식
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] input = br.readLine().split(" ");
//        int cnt = 0;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i].equals(""))
//                continue;
//            cnt++;
//        }
//        System.out.println(cnt);
//    }
}

//// split( )의 특징을 알 수 있는 code
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    String[] input = br.readLine().split(" ");
//        for(int i=0;i< input.length;i++){
//        if(input[i].equals(""))
//        System.out.println("1");
//        else
//        System.out.println(input[i]);
//        }