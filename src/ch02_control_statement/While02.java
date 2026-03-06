package ch02_control_statement;

/*
이름 : While02
while 구문과 switch 구문을 사용하여 1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.
int odd = 0, even = 0 ;
*/

public class While02 {
    static void main() {

        int odd = 0, even = 0 ;

        int i = 1;

        while(i<=10){
            switch(i%2){
                case 1:
                    odd += i;
                    break;
                case 0:
                    even += i;
            }
            i += 1;
        }

        System.out.println("짝수의 합 : " + odd);
        System.out.println("홀수의 합 : " + even);

    }
}