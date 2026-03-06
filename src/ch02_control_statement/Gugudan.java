package ch02_control_statement;

/*
이름 : Gugudan
int dan = 3 ;
3단을 출력해는 프로그램 작성

예시:
3 * 1 = 3
3 * 2 = 6
...
3 * 9 = 27
*/

public class Gugudan {
    static void main() {

        int dan = 3;

        for (int i = 1; i<=9; i+=1){
            System.out.println(dan + " * " + i +" = " + (dan*i) );
        }

    }
}
