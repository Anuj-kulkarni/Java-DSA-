import java.util.ArrayList;

public class activity {
    public static void main(String[] args) {
        int [] start_t = {1, 3, 0, 5, 8, 5};
        int [] end_t = {2, 4, 6, 7, 9, 9};

        ArrayList<Integer> ans = new ArrayList<>();
        int maxActivity = 1;
        ans.add(0);
        int last_actitvity = end_t[0];

        for(int i=1; i<end_t.length; i++){
            if(start_t[i] >= last_actitvity){
                maxActivity++;
                ans.add(i);
                last_actitvity = end_t[i];
            }

        }

        System.out.println(maxActivity);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();

    }
}
