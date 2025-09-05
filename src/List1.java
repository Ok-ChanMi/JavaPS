import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) {
        /*
         자바의 리스트는 코테 기준 ArrayList의미
         배열과 ArrayList의 가장 큰 차이점은 배열의 크기는 고정 ArrayList는 가변
         */

        // 리스트 객체 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 값 추가
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list.get(2));
        System.out.println(list);
    }
}
