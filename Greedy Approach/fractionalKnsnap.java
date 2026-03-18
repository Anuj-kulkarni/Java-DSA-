import java.util.*;

public class fractionalKnsnap {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight [] = {10, 20, 30};

        int w = 50;
        double ratio [][] = new double[value.length][2]; // bcz the decimal values are also important
        // 1st index store the value of index 
        // 2nd index store the ratio of value to weight

        int capacity = w;
        for(int i=0; i<value.length && capacity > 0; i++){
            ratio [i][0] = i; // stores the index 
            ratio [i][1] = value[i]/(double)weight[i]; // stores the value/ weight ratio
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        double finalVal = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
                if(capacity >= weight[idx]){
                    finalVal += value[idx];
                    capacity -= weight[idx];
                }else{
                    // include fractional items
                    finalVal +=(ratio[i][1] * capacity);
                    capacity = 0;
                    break;
                }
            }
            System.out.println(finalVal);
        }
}