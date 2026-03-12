package ch06_abstract_interface.teamProject01;

public class Americano extends Drink implements BadAmericano{
    private int shotCount; // 샷 개수 (단위 = 샷)
    private double waterAmount; // 물의 양 (단위 = ml)


    // 서브클래스들에 각자의 특성 + 수퍼클래스의 공통분모를 매개변수로 생성자 생성
    public Americano(String name, double price, int shotCount, double waterAmount) {
        this.shotCount = shotCount; // 매개변수를 Americano서브클래스의 맴버변수에 재할당
        this.waterAmount = waterAmount; // 매개변수를 Americano서브클래스의 맴버변수에 재할당
        super(name, price); // 수퍼클래스의 생성자 호출 (공통분모)
    }

    // cafeMain클래스의 for반복문이 정상적으로 돌아가기 위해 Drink수퍼클래스의 toString메소드 오버라이딩
    // Americano서브클래스의 맴버변수를 이용한 문자열 입력 후 리턴
    @Override
    public String toString() {
        String menuFeature = super.toString() + ", 샷 개수 : " + shotCount + "샷, 물의 양 : " + waterAmount + "ml";
        return menuFeature ;
    }
}
