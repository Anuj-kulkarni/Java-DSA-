import java.util.*;

public class pairsum1 {

    public static int PairSum1(ArrayList<Integer> list, int target){

        int flag = 0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    flag ++;
                }
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;

        System.out.println(PairSum1(list, target));
    }
}
