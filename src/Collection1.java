import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Collection1 {
    public static void main(String[] args) {
        // use primitive type
        int i = 0;
        long[] longs = new long[10];
        float f = 10.5f;
        double d = 10 / 3.0;

        // use reference type(꼭 필요한 경우가 아니라면 권장 x)
        Integer I = 0;
        Long[] Longs = new Long[10];
        Float F = 10.5f;
        Double D = 10 / 3.0;

        /*
        // 문법 오류 발생
        ArrayList<int> arrayList = new ArrayList<>();
        Stack<long> stack = new Stack<>();
        Queue<float> queue = new Queue<>();
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>();
        */

        // 올바른 코드
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Long> stack = new Stack<>();
        Queue<Float> queue = new ArrayDeque<>();
        ArrayDeque<Double> arrayDeque = new ArrayDeque<>();

        /*
        * 컬렉션 프레임워크는 제네릭 기반
        * 제네릭은 객체만 받는다고 규칙이 정해져 있어서 컬렉션프레임워크에 프리미티브 타입은 불가능
        * + 컬렉션프레임워크에서 컴파일 할때 object로 저장해서 컴파일러가 자동으로 캐스팅한다?
        *   그래서 프리미티브는 주소도 없는 그냥 값이라 불가능
        * */
    }
}
