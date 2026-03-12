package ch06_abstract_interface.teamProject01;

public class cafeMain {
    static void main(String[] args) {

        // 카페이름 및 메뉴 제시 출력
        System.out.println("안녕하세요 " + Drink.CafeName + "입니다.\n\n메뉴를 보여드리겠습니다.\n\n");

        // 배열 - 초기화 기법
        // 클래스명[] 배열명 = {배열 요소}
        Drink[] Menu = {
                new Americano("아메리카노", 3900.0, 3, 400.0),
                new Espresso("에스프레소", 4500.0, 2, "에티오피아"),
                new MintChoco("민트초코 스무디", 5900.0, 3, 2),
                new Yogurt("요거트", 6100, "그리스", "상")
        };

        // for반복문, 배열요소 출력
        for (int i = 0; i < Menu.length; i++) {
            System.out.println((i+1) + "번 메뉴\n" + Menu[i] + "\n");
        }

        // 변동사항 알리기
        System.out.println("가게 사정으로 인해 원재료의 품질과 양의 변경사항이 있어 안내드립니다.\n");



        // 메뉴 고르기
        System.out.println("원하시는 메뉴의 숫자를 입력해주세요\n( 1 / 2 / 3 / 4 )\n");

    }
}
