public class firstL {

    public static boolean Fletter(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) != str.charAt(j)){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str = "aabccxb"; // o/p must be x
    }
}
