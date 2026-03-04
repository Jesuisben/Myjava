package ch2_control_statement;
//int month = 3 ;
//switch 구문을 사용하여 4계절 중 해당 계절 정보 출력하기
//switch 구문
public class Switch02 {
    static void main() {
        int month = 3;

        switch(month){
            case 3: case 4: case 5:
                System.out.println(month + "월은 봄입니다.");
                break;

            case 6: case 7: case 8:
                System.out.println(month + "월은 여름입니다.");
                break;

            case 9: case 10: case 11:
                System.out.println(month + "월은 가을입니다.");
                break;

            case 12: case 1: case 2:
                System.out.println(month + "월은 겨울입니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
