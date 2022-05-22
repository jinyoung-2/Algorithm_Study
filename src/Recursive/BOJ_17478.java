package Recursive;

import java.util.Scanner;

// 다른 사람 풀이 참고한 code
public class BOJ_17478 {
    static String underbar = "";

    public static void recursive(int n) {
        // 따로 저장을 안 하면 나중에 line이 안 줄어든다.
        String line = underbar;

        // 재귀함수의 종료조건
        if(n == 0) {
            System.out.println(line + "\"재귀함수가 뭔가요?\"");
            System.out.println(line +"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(line + "라고 답변하였지.");
            return;
        }
        // 재귀함수의 반복
        System.out.println(line + "\"재귀함수가 뭔가요?\"");
        System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        // 줄 생성
        underbar += "____";

        recursive(n - 1);

        // 맨 마지막
        System.out.println(line + "라고 답변하였지.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(n);
    }
}

//// 내 풀이
//public class BOJ_17478 {
//    public static String[] str1 = {
//            "\"재귀함수가 뭔가요?\"\n",
//            "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
//            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
//            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n",
//    };
//    public static String[] str2 = {
//            "\"재귀함수가 뭔가요?\"\n",
//            "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n",
//            "라고 답변하였지.\n"
//    };
//    public static int cnt = 0;  // ____출력 횟수 count
//
//    void recursiveFunc(int n) {
//        if (n == 0){
//
//            for(String ouput:str2){
//                for(int i=1;i<=cnt;i++){
//                    System.out.print("____");
//                }
//                System.out.print(ouput);
//            }
//            cnt--;
//            return ;
//        }
//
//        for (int i=0;i<=3;i++) {
//            for(int j=1;j<=cnt;j++){
//                System.out.print("____");
//            }
//            System.out.print(str1[i]);
//        }
//        cnt++;
//        recursiveFunc(n - 1);
//
//        for(int i=1;i<=cnt;i++)
//            System.out.print("____");
//        System.out.print(str2[2]);
//        cnt--;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();   // 재귀 횟수
//
//        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//        new BOJ_17478().recursiveFunc(n);
//    }
//}
