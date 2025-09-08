/*
자바에서 문자열은 이뮤터블 객체
이뮤터블 객체 -> 값을 변경할 수 없는 객체를 의미(시간 복잡도 관점에서 사용시 주의)
 */
public class Immutable {
    public static void main(String[] args) {
        String string = "Hello, World";

        String string1 = "He";
        string1 +="llo";
        System.out.println(string1);

        String string2 = "Hello";
        string2 = string2.replace("l", "");
        System.out.println(string2);
    }
}
