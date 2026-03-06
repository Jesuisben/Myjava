package ch02_control_statement;
//int month = 3 ;
//if 구문을 사용하여 4계절 중 해당 계절 정보 출력하기
//다중 택일(if~else if)
public class If06 {
    static void main() {
        int month = 3;

        if(month>=3 && month <=5){
            System.out.println(month + "월은 봄입니다.");

        }else if(month>=6 && month <=8){
            System.out.println(month + "월은 여름입니다.");

        }else if(month>=9 && month <=11){
            System.out.println(month + "월은 가을입니다.");

        }else if(month==12||(month>=1 && month<=2)){
            System.out.println(month + "월은 겨울입니다.");

        }else{
            System.out.println("잘못된 입력입니다.");
        }
    }
}
