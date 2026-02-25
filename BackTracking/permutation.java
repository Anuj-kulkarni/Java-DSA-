public class permutation {
    public static void permutaion_string(String str, String ans){

        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // Kaam
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0, i) + str.substring(i+1);
            permutaion_string(Newstr, ans+curr);            
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        permutaion_string(str, "");
    }
}
