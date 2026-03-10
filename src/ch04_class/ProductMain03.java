package ch04_class;

public class ProductMain03 {
    static void main(String[] args) {
        // 객체 생성 (선언 및 할당)
        // 클래스명 객체명 = new연산자 생성자();
        Product03 shin = new Product03("신라면", 1000, "2026/03/01");
        shin.display();

        Product03 blackbean = new Product03("짜파게티", "2026/03/10");
        blackbean.display();

        Product03 banana = new Product03();
        banana.display();

        int size = 2; // 상품 2개
        System.out.println("상품 " + size + "를 배열로 다뤄 봅니다.");

        int[]arr = new int[3]; //타입[]배열명 = new연산자 타입[요소개수];

        //클래스도 내가 만든 "타입"이라서 배열 만들기 가능 // 생성자들의 배열
        // 배열 정의 (new 연산자 기법) //객체인 상품 2개 있다~
        Product03[] itemlist = new Product03[size];

        // 0번째 객체 생성 *객체 생성을 이렇게도 할 수 있구나 (new 생성자())
        // 배열 객체 생성 문법 : 배열명[배열요소개수] = new연산자 클래스명(매개변수);
        itemlist[0] = new Product03("소이조이", 2000, "2025/08/15");
        itemlist[1] = new Product03("맥심커피", "2025/07/17");

        for (int i = 0; i < itemlist.length; i++) {
            System.out.println((i+1) + "번째 상품 정보");
            itemlist[i].display();
        }

        // 배열 정의 (초기화 기법) //초기화 기법의 객체 생성 문법 : new연산자 클래스명
        Product03[] productArray = {
                new Product03("쭈쭈바", 1500, "2025/12/25"),
                new Product03("사과", 3000, "2025/06/06"),
                new Product03("오징어땅콩", "2025/07/17")
        };

        for (int i = 0; i < productArray.length; i++) {
            System.out.println((i+1) + "번째 상품 정보");
            productArray[i].display();
        }



    }
}
