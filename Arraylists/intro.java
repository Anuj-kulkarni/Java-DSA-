import java.util.ArrayList;

public class intro{

    public static void main (String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        // ArrayList<Boolean> b = new ArrayList<>();

        a.add(1);
        // System.out.println(a);
        // System.out.println(a.get(0));


        // Operations on ArrayLists
        // 1) Add element in List TP == O(1)
        // 2) Get Element in List TP == O(1)
        // 3) Remove Element in List TP == O(n)
        // 4) Set Element at index in List TP == O(n)
        // 5) Contains Element returns boolean type TP == O(n)


        // To access the Elements in arraylists we need to use get function

        // To Print the arraylist use for loop
        // .size() to get the size of arraylists

        a.add(2);
        a.add(3);
        a.add(4);

        for(int i=a.size()-1; i>=0; i--){
            System.out.print(a.get(i) + " ");
        }
        int max = Integer.MAX_VALUE;
        System.out.println(max);
    }
}