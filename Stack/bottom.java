import java.util.*;
public class bottom {

    public static String ReveseStack(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        str = result.toString();
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(ReveseStack("abc"));
        // ReveseStack("b");
        // ReveseStack("c");
    }
}
