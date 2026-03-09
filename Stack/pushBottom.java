import java.util.*;
public class pushBottom {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){ // if the stack is empty then it will push the last int value in the stack 
            s.push(data);
            return;// and return to the main function
        }
        int top = s.pop(); // remove the top of the stack and store it in main memory for temporary purpose
        pushAtBottom(s, data); // recursive call to the function and pop the element from the stack
        s.push(top); // after the calls for the stack push the elements to the stack again in reverse order again
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
    }
}
