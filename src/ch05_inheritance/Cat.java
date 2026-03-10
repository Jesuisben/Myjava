package ch05_inheritance;

public class Cat extends Animal {
    boolean indoor; //애완묘, 길고양이

    public void display(){
        super.display();

        if(indoor){
            System.out.println("애완묘 여부 : 적합");
        }else{
            System.out.println("애완묘 여부 : 부적합");
        }
    }
}
