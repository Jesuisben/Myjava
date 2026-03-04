package ch01_variable_operator;
// 3개의 정수 중에서 가장 큰 숫자를 구해봅니다.
// 예를 들어서 3, 8, 4 중 최대의 정수는 8입니다.
public class CondOper {
    static void main() {
        int x = 3, y = 8, z = 4;
        int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("출력 결과 : " + x + ", " + y +", " + z + "중 최대 수는 " + max + "입니다.");
    }
}
