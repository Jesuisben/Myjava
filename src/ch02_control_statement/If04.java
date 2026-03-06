package ch02_control_statement;
// int su = 4;
// su가 3의 배수이면 출력하는 프로그램 작성
// 단순 if
public class If04 {
    static void main() {
        int su = 4;

        if (su%3==0){
            System.out.println(su + "은(는) 3의 배수입니다.");
        }
    }
}
