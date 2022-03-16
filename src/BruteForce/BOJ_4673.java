package BruteForce;

import java.util.Arrays;

public class BOJ_4673 {
    public static void main(String[] args) {

        boolean[] check = new boolean[10001];   //0~10,000
        Arrays.fill(check, false);

        //핵심 로직: 셀프 넘버 찾기
        for(int i=1;i<=10000;i++){
            int number = i;
            int sum = i;
            while(number!=0){
                sum += number%10;
                number /= 10;
            }
            if(sum<=10000){
                check[sum]=true;
            }

        }

        //출력
        for(int i=1;i<=10000;i++){
            if(!check[i]){  //셀프 넘버는 check[i]==false인 경우임
                System.out.println(i);
            }
        }
    }
}
