import java.util.LinkedList;

public class collection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);


        ll.removeLast();
        System.out.println(ll);
    }
}
