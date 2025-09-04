/*정수형*/
public class Q4 {
    public static void main(String[] args) {
        int a = 13;
        int b = 4;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(" ");

        System.out.println("정수형 비교연산");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(" ");


        System.out.println("정수형 비트 연산");
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);
        System.out.println(a << 2);
        System.out.println(a >> 1);
        System.out.println(" ");

        System.out.println("부독소수형 사칙연산과 모듈러 연산");
        System.out.println(2.5 + 3.7);
        System.out.println(7.9 - 4.2);
        System.out.println(1.5 * 4.8);
        System.out.println(10.0 / 3.2);
        System.out.println(10.0 % 3.2); // 모듈러 = 나머지를 구하는 연산 부동소수는 표현과정에서 오차가 발생(부동소수형 데이터를 이진법으로 구하기 때문)
        System.out.println(" ");

        double x = 0.5;
        double y = 1.2;
        double z = 2.0;
        System.out.println("부동소수형 논리 연산");
        System.out.println(x > y && y < z);
        System.out.println(x < y || y < z);
        System.out.println(!(x > y));
    }

}
