import java.util.ArrayList;

public class swap {

    public static void Swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, indx2);
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(55);
        System.out.println(list);

        Swap(list, 1, 4);
        System.out.println(list);

    }
}
