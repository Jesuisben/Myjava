package ch02_control_statement;

/*
이름 : ForSwitch01
for 구문과 switch 구문을 사용하여 1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.
*/

public class ForSwitch01 {
    static void main() {

        int odd = 0; //홀수
        int even = 0; //짝수

        for(int i = 1; i<=10; i+=1){
            switch (i%2){
                case 1:
                    odd += i;
                    break;
                case 0:
                    even += i;
            }
        }

        System.out.println("짝수의 합 : " + odd);
        System.out.println("홀수의 합 : " + even);
    }
}
