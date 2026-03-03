package ch01_variable_operator;

public class CondOper {
    static void main() {
        int x = 3, y = 8, z = 4;
        int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
        System.out.println("출력 결과 : " + x + ", " + y +", " + z + "중 최대 수는 " + max + "입니다.");
    }
}
