package ch04_class;

public class exProductMain02 {
    static void main() {
        //객체 생성 및 메소드 이용 출력
        exProduct02 tagHeuer = new exProduct02("tagHeuer","automatic", 38,"stainLess");
        tagHeuer.display();

        // 객체 이용해서 배열 생성 (new 연산자 기법)
        exProduct02[] watch = new exProduct02[4];

        // 줄바꿈 생성 3개
        System.out.println("");
        System.out.println("");
        System.out.println("");

        // 제목 만들기01
        System.out.println("시계 리스트 (new연산자 기법)");

        // 배열 요소에 값 할당
        watch[0] = new exProduct02("tagHeuer_Aqua_racer", "automatic", 38, "stainLess");
        watch[1] = new exProduct02("seiko_Alpinist", "automatic", 72, "stainLess" );
        watch[2] = new exProduct02("tissot_Le_locle", "automatic", 80, "stainLess");
        watch[3] = new exProduct02("citizen_Attesa", "quartz", 4380, "titanium");


        // 반복문 이용해서 출력
        for (int i = 0; i < watch.length; i++) {
            watch[i].display();
            System.out.println("");
        }

        // 제목 만들기02
        System.out.println("시계 리스트 (초기화 기법)");

        // 객체 이용해서 배열 생성 (초기화 기법)
        exProduct02[]watch2 = {
            new exProduct02("tagHeuer_Aqua_racer", "automatic", 38, "stainLess"),
            new exProduct02("seiko_Alpinist", "automatic", 72, "stainLess" ),
            new exProduct02("tissot_Le_locle", "automatic", 80, "stainLess"),
            new exProduct02("citizen_Attesa", "quartz", 4380, "titanium")
        };

        // 반복문
        for (int i = 0; i < watch2.length; i++) {
            watch2[i].display();
            System.out.println("");
        }
    }
}
