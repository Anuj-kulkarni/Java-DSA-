import java.util.*;

public class sort_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(55);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted arrayList in reverse order");
        System.out.println(list);
    }
}
