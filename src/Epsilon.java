public class Epsilon {
    public static void main(String[] args) {
        double epsilon = 1E-5;

        // 앱실론 출력
        System.out.println(epsilon);

        // 부동소수점 수 오차 검사
        double a = 0.1 + 0.2;
        double b = 0.3;
        System.out.println(a-b);

        if (a == b){
            System.out.println("a, b equal");
        }else {
            System.out.println("a, b not equal");
        }

        if(Math.abs(a - b) < epsilon){
            System.out.println("a, b equal");
        }else {
            System.out.println("a, b not equal");
        }
    }
}
