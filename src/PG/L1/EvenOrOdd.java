package PG.L1;

public class EvenOrOdd {
    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();

        // 아래는 테스트로 출력해보기 위한 코드입니다.
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(2));
        System.out.println("결과 : " + evenOrOdd.evenOrOdd(3));
    }
}
