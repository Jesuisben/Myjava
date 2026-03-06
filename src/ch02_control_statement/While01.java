package ch02_control_statement;

public class While01 {
    static void main(String[] args) {
        /*
        // 1부터 10까지 숫자의 총합
        int total = 0;

        int i = 1;

        while (i<11){
            total += i;
            i++;
        }

        System.out.println("총합01 : " + total);
         */

        // 1부터 100까지 3씩 증가하는 수의 총합
        // 1 + 4 + 7 + ... + 100 = 1717
        int total = 0 ;
        int i = 1; //초기식
        while (i<=100){//조건식
            total += i;
            i += 3;//증감식
        }

        System.out.println("총합02 : " + total);

        // 97부터 2까지 5씩 감소하는 수의 총합
        // 97 + 92 + 87 + ... + 2 =990
        total = 0;
        i = 97;

        while (i>=2){
            total += i;
            i -= 5;
        }

        System.out.println("총합03 : " + total);

        // 1부터 100까지 5씩 증가하는 수의 제곱의 총합
        // 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
        total = 0;
        i = 1;

        while(i<=100){
            total += i*i;
            i += 5;
        }

        System.out.println("총합04 : " + total);
    }
}
