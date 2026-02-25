import java.util.*;

public class d2arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);list.add(2);
        mainlist.add(list);
        System.out.println(mainlist);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3); list2.add(4);
        mainlist.add(list2);

        System.out.println(mainlist);
    }
}
