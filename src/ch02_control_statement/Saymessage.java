package ch02_control_statement;

/*
이름 : Saymessage
"안녕하세요."라는 문구를 5번 출력해 보세요.
String message = "안녕하세요.";
int su = 5 ;

예시:
안녕하세요.
안녕하세요.
안녕하세요.
안녕하세요.
안녕하세요.
*/

public class Saymessage {
    static void main() {

        String message = "안녕하세요.";
        int su = 5;

        for (int i = 1; i<=5; i+=1){
            System.out.println(message);
        }

    }
}
