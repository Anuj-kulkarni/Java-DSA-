import java.util.*;

public class Pairsum22 {
    public static boolean breakingPoint(ArrayList<Integer> list, int target, int n){
        int bp = -1;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;

            }

        }
        int lp = bp +1; // smallest
        int rp = bp; // largest

        while(lp != rp){
            // case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            else if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }
            else{
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String []args){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(11);
            list.add(15);
            list.add(6);
            list.add(8);
            list.add(9);
            list.add(10);

            int target = 1;

            // System.out.println(breakingPoint(list, 0, list.size()-1));

            System.out.println(breakingPoint(list, target, list.size()));
    }
}
