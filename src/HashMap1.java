import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // 해시 맵 값 삽입
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        // 해시맵 값 출력
        System.out.println(map);

        // 해시맵의 데이터 검색
        String key = "apple";

        if(map.containsKey(key)){
            int value = map.get(key);
            System.out.println(key + ": " + value);
        } else {
            System.out.println(key + "는 해시맵에 없습니다.");
        }
    }
}
