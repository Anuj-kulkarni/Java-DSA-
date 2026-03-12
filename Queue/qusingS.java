import java.util.*;

public class qusingS {

    static class queue{
        public void add(int data, Stack<Integer> s1, Stack<Integer> s2){
            s1.push(data);

            s1.push(data);
            while(!s2.isEmpty()){
                int front = s2.pop();
                s1.push(front);
            }
        }

        public void print(Stack<Integer> s1, Stack<Integer> s2){
            if(s1.isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            while(!s1.isEmpty()){
                int top = s1.pop();
                System.out.println(top);
                s1.pop();
            }
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        queue q = new queue();
        q.add(1, s1, s2);
        System.out.println("Printing the Queue");
        q.print(s1, s2);
    }
}