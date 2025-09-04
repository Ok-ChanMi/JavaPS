import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Collection {
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
    }
}
