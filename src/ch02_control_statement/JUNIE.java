package ch02_control_statement;

public class JUNIE {
    static void main() {

        /*
                      반복횟수 4(n) -> 띄어쓰기 는 4-1가 최초 시작

           *          띄어쓰기 3(n-1) / (*)변수+=2
          ***         띄어쓰기 2
         *****        띄어쓰기 1 / 나누기 2를 정수형으로 하면 띄어쓰기 갯수됨
        *******       띄어쓰기 0
         */

        int loop = 4;
        int x = loop;

        // int space = loop - 1;

        for(int i=loop;i>=1;i-=1){

            for(int y = x; y>=1; y-=1) {
                System.out.print(" ");
            }

            x -= 1;

            System.out.println("*");
        }
    }
}
