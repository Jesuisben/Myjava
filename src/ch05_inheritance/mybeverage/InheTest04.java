package ch05_inheritance.mybeverage;

public class InheTest04 {
    static void main(String[] args) {
        // 승급(UpCasting) : 낮은 등급의 클래스가 높은 등급의 클래스 타입으로 한시적 형태가 바뀌는 동작
        // 참조 형변환
        // 전제 조건 : 반드시 상속 관계이어야 합니다.
        // 부모입장에서 자식들 관리를 편하게 하려고 사용하는 방법
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);
        // beverage01은 승급(UpCasting)에 의해 Americano04에서 Beverage04의 객체가 완전히 바뀐것처럼 보이지만
        // 절대 아님! 주의해야함! - 한!시!적!으로 형태가 바뀌는거지 본질이 바뀐건 아님
        // But beverage01객체는 Americano04클래스의 메소드를 못쓰고 Beverage04클래스의 메소드밖에 못씀
        // 암시적 형변환

        // 수퍼 클래스내 들어 있는 메소드는 상속의 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        Americano04 coffee = (Americano04) beverage01; // 강등 - 명시적 형변환
        //이해하기 위해서는
        // int i = (int)3.14; 처럼 생각해서 클래스도 개발자가 만들어 낸 타입이라고 생각해서 그대로 대입
        // 클래스명(타입) 새로운객체(변수) = (클래스명(타입))이전객체명(데이터값);
        coffee.sipAmericano();
        System.out.println();

        Beverage04 beverage02 = new Espresso04("에스프레소", 5000.0, 2);
        beverage02.showInfo();

        Espresso04 coffee02 = (Espresso04) beverage02; // 강등
        coffee02.drinkEspresso();
        System.out.println();

        Beverage04 beverage03 = new Latte04("라떼", 6000.0, "딸기 우유");
        beverage03.showInfo();

        Latte04 coffee03 = (Latte04) beverage03;
        coffee03.enjoyLatte();
        System.out.println();

        // 승급 개념과 배열의 사용
        Beverage04[] beverage = {
                beverage01,
                new Espresso04("마이뿌레소", 2000.0, 1),
                new Latte04("바나나 라떼", 7000.0, "바나나 우유")

        };

        for (int i = 0; i < beverage.length; i++) {
            System.out.println("--------------------------------------------");
            beverage[i].showInfo();

            // instanceof : 승급된 객체 변수가 수많은 서브 클래스 중에서 어떤 클래스로
            //              생성이 되었는 지를 판단하고자 할 때 사용합니다.
            if (beverage[i] instanceof Americano04) { // 아메리카노
                Americano04 ameri = (Americano04) beverage[i];
                ameri.sipAmericano();
                System.out.println(beverage[i]); // 객체를 프린트하면 암시적으로 toString() 메소드가 호출이 됩니다.
                //System.out.println(beverage01.toString);

            } else if (beverage[i] instanceof Espresso04) { // 에스프레소
                Espresso04 espre = (Espresso04) beverage[i];
                espre.drinkEspresso();
                System.out.println(beverage[i]);

            } else if (beverage[i] instanceof Latte04) { // 라떼
                Latte04 latt = (Latte04) beverage[i];
                latt.enjoyLatte();
                System.out.println(beverage[i]);
            } else { // 차후에...

            }
        }

    }

}
