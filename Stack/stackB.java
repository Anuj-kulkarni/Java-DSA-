import java.util.ArrayList;

public class stackB{

    static class Stack{
        static ArrayList<Integer> S = new ArrayList<>();
        public static boolean isEmpty(){
            return S.size() == 0;
        }

        // push function of stack using 0(1) Time complexity
        public static void push(int data){
            S.add(data);
        }

        // pop function of stack using 0(1) Time complexity
        public static int pop(){
            int pop = S.get(S.size()-1);
            S.remove(pop);
            return pop;
        }

        // peek function of stack using 0(1) Time complexity
        public static int peek(){
            int top = S.get(S.size()-1); // top of the stack 
            // S.remove(pop);
            return top;
        }
    }
    public static void main(String[] args) {
        
    }
}