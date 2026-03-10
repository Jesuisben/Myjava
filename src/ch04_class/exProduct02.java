package ch04_class;

public class exProduct02 {
    // 맴버 변수 생성 // 기본값 설정
    String name = "no_info";
    String movement = "no_info";
    int power_reserve = 0;
    String material = "no_info";

    // 메소드 생성 // 매개변수 4개
    exProduct02(String name, String movement, int power_reserve, String material){
        this.name = name;
        this.movement = movement;
        this.power_reserve = power_reserve;
        this.material = material;
    }

    // 메소드 생성
    public void display() {
        System.out.println("이름 : " + name);
        System.out.println("구동 방식 : " + movement);
        System.out.println("파워리저브 : " + power_reserve + "hours");
        System.out.println("재질 : " + material);
    }
}
