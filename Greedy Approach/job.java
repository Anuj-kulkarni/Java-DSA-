import java.util.*;

public class job {

    static class JobInfo {
        int deadline;
        int profit;
        int id;

        public JobInfo(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsinfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<JobInfo> j = new ArrayList<>();

        for (int i = 0; i < jobsinfo.length; i++) {
            j.add(new JobInfo(i, jobsinfo[i][0], jobsinfo[i][1]));
        }

        Collections.sort(j, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
       int time = 0;
       for(int i=0; i<j.size(); i++){
        JobInfo curr = j.get(i);
        if(curr.deadline > time){
            seq.add(curr.id);
            time++;
        }
       }

       System.out.println("Max Jobs =" + seq.size());
       for(int i=0; i<seq.size(); i++){
            System.out.println(seq.get(i) + " ");
       }

    }
}
