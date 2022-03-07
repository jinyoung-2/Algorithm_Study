package Greedy;

import java.io.IOException;
import java.util.*;

public class PG_큰수만들기 {
    public static void main(String[] args) throws IOException {

        /**
         * String인 number에서 K개의 수 제거
         * = number.length() - K 개의  수 선택
         *
         * ex) 23563850135에서 4개의 수 제거 = 12-4인 8개의 수 선택
         * */

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder answer = new StringBuilder();

        int idx = 0;    //선택된 문자의 index값
        int comp = 0;   //선택된 문자의 숫자값
        for(int i=number.length()-k;i>0;i--){   //남은 선택할 문자의 개수
            comp = number.charAt(idx)-'0';  //선택할 문자 초기화
            for(int j=idx;j<=number.length()-i;j++){   //최댓값 찾는 루프 => 여기 이해 안 돼.
                if(comp < number.charAt(j)-'0'){
                    comp = number.charAt(j)-'0';
                    idx = j+1;
                }
            }
            answer.append(comp);
        }
        System.out.println(answer.toString());
    }
}