package ch01_variable_operator;
// 3개의 정수 중에서 가장 큰 숫자를 구해봅니다.
// *추가 - 출력시 순서는 낮은 숫자 순서대로 출력합니다.
// 예를 들어서 3, 8, 4 중 최대의 정수는 8입니다.
// 출력 -> 출력 결과 : 3, 4, 8중 최대 수는 8입니다.
// 조건 연산자(3항 연산자)와 논리 연산자(and, or, not)을 이용하여 작성합니다.
public class CondOper응용문제 {
    static void main() {
        int x = 3, y = 8, z = 4;
        int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
        int middle = ((x > y && y > z)||(z > y && y > x)) ? y : (((y > z && z > x)||(x > z && z > y)) ? z : x);
        int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
        System.out.println("출력 결과 : " + min + ", " + middle +", " + max + "중 최대 수는 " + max + "입니다.");
    }

}
