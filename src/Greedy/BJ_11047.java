package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// K원을 만들 때 최소한의 개수를 이용해야 하니, 당연하게 가장 큰 가치를 지닌 동전부터 선택하는 것이 당연함.
// 즉, N개의 동전 중 가장 큰 가치를 지니 동전부터 탐색하여 동전의 가치가 K보다 클 경우는 넘어가고, 아닐 경우는 최대 구성 가능한 개수를 더해주면 됨.

// 방법1. => 시간복잡도 너무 커서, 추천X
public class Greedy.BJ_11047 {
    public static void main(String[] args) {
        /*
         * 준규 갖고 있는 동전의 종류: N
         * 가치의 합: K
         * 이때, 필요한 동전 최소 개수 구하기!
         * */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //동전 종류
        int K = sc.nextInt();   //가치 합

        // N개의 줄에 동전 가치가 오름차순으로 입력함
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<N;i++)
            list.add(sc.nextInt());

        // 출력: K원을 만드는데 필요한 동전의 최소 개수 출력
        list.sort(Comparator.reverseOrder());   //list 내림차순으로 변경
        int i=0,cnt=0;
        while(true){
           if(K>=list.get(i)){
               K-=list.get(i);
               cnt++;
           }
           else{    //K<list.get(i)
               if(i+1>=N)
                   break;
               i++;
           }
        }
        System.out.println(cnt);
    }
}



// 방법2. [Scanner + StringBuilder] => 가장 일반적인 방법
public class BJ_11047 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //동전 종류
        int K = sc.nextInt();   //가치 합

        // List 자료구조를 이용해서 reverse.order()를 하는 것보다 배열을 이용해서 인덱스로 접근하는 것이 시간 효율성 good
        int[] coin = new int[N];
        for(int i=0;i<N;i++){
            coin[i] = sc.nextInt();
        }

        // 출력: K원을 만드는데 필요한 동전의 최소 개수 출력
        int cnt=0;
        for(int i = N-1; i>=0; i--){

            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능
            // 나눗셈을 통한 몫과 나머지를 잘 이용하기!
            if(coin[i] <= K){
                cnt += (K / coin[i]);
                K %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}


// 방법3. [BufferedReader + StringBuilder]
/*
* 입력방법을 Scanner 대신 BufferedReader을 사용하여 풀이하는 방법
* 단, BufferedReader는 문자열을 한 줄로 읽기 때문에 N과 K를 구분하기 위해 공백을 기준으로 문자열을 분리해줘야 해서
*       StringTokenizer를 사용하여 푼다.
* */
public class BJ_11047 {

    public static void main(String[] args) throws IOException { //IOException check

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];

        for(int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        int cnt = 0;
        for(int i = N - 1; i >= 0; i--) {

            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            if(coin[i] <= K) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                cnt += (K / coin[i]);
                K %= coin[i];
            }
        }
        System.out.println(cnt);
    }
}