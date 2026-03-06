package ch02_control_statement;

public class For02 {
    static void main(String[] args) {
        // 1부터 10까지의 정수 중에서 짝수와 홀수의 합을 각각 구해주세요.

        int odd = 0, even = 0;

        /* // 2개의 for문으로 만들기
        // 1부터 10까지의 홀수 총합
        for (int i = 1; i<11; i += 2){
            odd += i;
        }

        System.out.println("홀수 총합 : " + odd);

        // 1부터 10까지의 짝수 총합
        for (int i = 2; i<11; i += 2){
            even += i;
        }

        System.out.println("짝수 총합 : " + even);
        */

        // 1개의 for문 + if제어문으로 만들기
        for (int i = 1; i < 11; i += 1) { // i++도 가능
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        System.out.println("홀수 총합 : " + odd);
        System.out.println("짝수 총합 : " + even);
    }
}