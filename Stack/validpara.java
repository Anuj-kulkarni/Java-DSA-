import java.util.*;

public class validpara{

    public static boolean valid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) return false; // no opening bracket
                char top = s.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // mismatch
                }
            }
        }
        
        return s.isEmpty(); // all matched
    }

    public static void main(String[] args) {
        String str = "({[]})";
        System.out.println(valid(str)); // true
    }
}