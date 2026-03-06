package ch02_control_statement;

/*
이름 : SumOneToN
1부터 n까지의 정수를 총합을 구하는 프로그램을 작성해 보세요.
int n = 5 ;

예시:
1부터 5까지의 총합은 15입니다.
*/

public class SumOneToN {
    static void main() {

        int total = 0;
        int n = 5;

        for (int i = 1; i<=n; i+=1){
            total += i;
        }

        System.out.println("1부터 " + n + "까지의 총합은 " + total + "입니다.");

    }
}
