import java.util.ArrayList;
import java.util.List;

public class GuardClauses {
    static int calculateAverage(List<Integer> numbers){
        if(numbers == null) return 0;

        if(numbers.isEmpty()) return 0;

        int total = numbers.stream().mapToInt(i -> i).sum();
        return total / numbers.size();
    }

    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);

    int cal = calculateAverage(list);
        System.out.println(cal);
    }
}
