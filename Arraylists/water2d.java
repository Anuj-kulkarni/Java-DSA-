public class water2d {
    public static void main(String[] args) {
        int height[] = {1,1};

        int i=0; // left pointer
        int j=height.length - 1; // right pointer
        int maxarea = 0; // intialization of maxarea

        while(i < j){ // traversal of pointers
            int area = (j-i) * Math.min(height[i], height[j]); // calculations of area

            maxarea = Math.max(maxarea, area); // maximum area finding

            if(height[i] < height[j]){ 
                i++;
            }else{
                j--;
            }
        }

        System.out.println(maxarea);
    }
}
