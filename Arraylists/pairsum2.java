import java.util.ArrayList;

public class pairsum2 { // Same as Binary search using 2 pointer

    public static boolean Pairsum1(ArrayList<Integer> list, int target, int ei, int si){ // always watch for parameter and arguments you passes
        while(si < ei){
            if(list.get(si) + list.get(ei) == target){
                return true;
            }else if(list.get(si) + list.get(ei) < target){
                si++;
            }else if(list.get(si) + list.get(ei) > target){
                ei--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            int target = 5;
            System.out.println(Pairsum1(list, target,  list.size()-1,0));
        }
}
