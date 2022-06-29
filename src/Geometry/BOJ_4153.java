package Geometry;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            String input = br.readLine();
            if (input.equals("0 0 0")) {
                break;
            }
            st = new StringTokenizer(input, " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            if(Math.pow(x,2)==Math.pow(y,2)+Math.pow(z,2)){
                sb.append("right\n");
            }
            else if(Math.pow(y,2)==Math.pow(x,2)+Math.pow(z,2)){
                sb.append("right\n");
            }
            else if(Math.pow(z,2)==Math.pow(x,2)+Math.pow(y,2)){
                sb.append("right\n");
            }
            else{
                sb.append("wrong\n");
            }
        }
        System.out.print(sb);
    }
}
