package ch02_control_statement;

/*
이름 : PrintStar
별을 한줄에 5개씩 출력하는 프로그램 만들기
int star = 12 ;

힌트 :
출력시 엔터키를 누르지 않으려면 다음 구문을 사용하면 됩니다.
System.out.print("*");

예시:
*****
*****
**

*/

public class PrintStar {
    static void main() {

        int star = 12;

        for(int i = 1; i<=star; i+=1){
            System.out.print("*");
            if(i%5==0){
                System.out.println("");
            }
        }

    }
}
