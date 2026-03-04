package ch2_control_statement;
//int su = 4 ;
//su가 7의 배수이면 제곱 값을 출력하고, 7의 배수 아니면 3을 더하는 프로그램 작성
//양자택일(if~else)
public class If05 {
    static void main() {
        int su = 4;

        if(su%7==0){
            System.out.println(su*su);

        }else{
            System.out.println(su+3);
        }
    }
}
