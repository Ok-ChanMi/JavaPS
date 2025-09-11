import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpression {
    private static class Node{
        int dest, cost;
        public Node(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Node[] nodes = new Node[5];
        nodes[0] = new Node(1, 10);
        nodes[1] = new Node(2, 20);
        nodes[2] = new Node(3, 15);
        nodes[3] = new Node(4, 5);
        nodes[4] = new Node(1, 25);
        Arrays.sort(nodes, (o1, o2) -> Integer.compare(o1.cost, o2.cost));

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                System.out.printf(
                        "compare: o1=(dest=%d, cost=%d), o2=(dest=%d, cost=%d) -> compare %d vs %d%n",
                        o1.dest, o1.cost, o2.dest, o2.cost, o1.cost, o2.cost
                );
                return Integer.compare(o1.cost, o2.cost);
            }
        });
    }
}
