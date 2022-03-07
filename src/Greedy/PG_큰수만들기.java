package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PG_큰수만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        String number = br.readLine();
        int K = sc.nextInt();   //제거할 수의 개수

        List<Integer> numCopy = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(number,"");
        for(int i=0;i<number.length();i++){
            numCopy.add(Integer.parseInt(st.nextToken()));
            result.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(result);

        for(int i=0;i<number.length()-K;i++){
            result.remove(i);
        }

        for(int i=0;i<numCopy.size();i++){
            for(int j=0;j<result.size();j++){
                if(numCopy.get(i) == result.get(j)){
                    numCopy.remove(i);
                    i--;
                }
            }
        }


        System.out.println(numCopy.toString());
    }
}
