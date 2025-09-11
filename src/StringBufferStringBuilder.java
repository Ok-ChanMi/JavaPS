public class StringBufferStringBuilder {
    public static void main(String[] args) {
        // String 객체는 immutable 객체 값을 변경할 수 없다는 것이 어떤 의미 인지 알아보기 위한 코드
        String s = "abc";
        System.out.println(System.identityHashCode(s));  // System.identityHashCode() 메서드는 객체를 특정할 수 있는 식별값 반환
        s += "def";
        System.out.println(System.identityHashCode(s));
        System.out.println(s);
        // System.identityHashCode() 메서드의 출력값이 달라짐
        // "abc"를 가진 s와 "abcdef"를 가진 s가 서로 다른 객체임을 의미
        // + String 객체의 값을 변경하는 작업은 새로운 String 객체를 만들고 값을 복사하는 작업이 수행됨을 의미(총 6번의 내부 연산 -> "abc"값 3개 복사, "def"값 3개 저장)


        long start = System.currentTimeMillis();
        String x = "";

        for (int i = 1; i <= 100000; i++){
            x += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(((end-start)/1000.0) + "초");

        // StringBuilder()
        long start1 = System.currentTimeMillis();
        StringBuilder x1 = new StringBuilder();
        for (int i = 1; i <= 100000; i++){
            x1.append(i);
           //System.out.println("i=" + i + ", length=" + x1.length());
        }

        long end1 = System.currentTimeMillis();

        System.out.println(((end1-start1)/1000.0) + "초");
        // String 의 값을 변경하는 연산이 많을 때는 효율이 높은 StringBuilder 클래스나
        // StringBuffer 클래스를 사용해야함 두 클래스의 차이는 멀티스레드 환경에서 Thread-Safe
        // 여부로 나뉨. 대부분 코테에서는 다수의 스레스 생성할 필요x StringBuilder 클래스가 속도 측면에서 미세하지만 더 빠름

        // StringBuilder 클래스의 활용 방벙
        // String 값을 변경하는 연산이 많을 때는 시간 초과가 발생하지 않게 꼭 StringBuilder 사용

        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder();

        // 문자열 Add
        sb.append(10);
        sb.append("ABC");

        // 출력
        System.out.println(sb);
        sb.deleteCharAt(3);  // 3번째 인덱스 문자 삭제
        System.out.println(sb);
        sb.insert(1, 2);  // 1번째 인덱스에 2라는 문자 추가
        System.out.println(sb);

    }
}
