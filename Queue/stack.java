import java.util.*;

public class stack {
    public static class s2q{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();


    public boolean isEmpty(){
        return q1.isEmpty() && q2.isEmpty();  // checking if both queues are empty
    }

    public void add(int data){
        if(!q1.isEmpty()){
            q1.add(data);
            return;
        }
        else{
            q2.add(data);
        }
    }

    public int remove(){
        if(isEmpty()){ //calling isEmpty function  
            System.out.println("Stack is empty");
            return -1;
        }

        int top = -1;
        if(!q1.isEmpty()) { // until q1 is not empty run while loop
            while(!q1.isEmpty()){
                top = q1.remove(); // removing the element and storing it in the top variable  
                if(q1.isEmpty()){ // after q1 isEmpty break the loop and add the element in q2 
                    break;
                }
                q2.add(top);
            }
        }else{ // same as case 1
            while(!q2.isEmpty()){
                top = q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }

        return top;  // return the variable top to main function
    }

    public int peek(){
        if(isEmpty()){ //calling isEmpty function  
            System.out.println("Stack is empty");
            return -1;
        }

        int top = -1;
        if(!q1.isEmpty()) { // until q1 is not empty run while loop
            while(!q1.isEmpty()){
                top = q1.remove(); // removing the element and storing it in the top variable  
                q2.add(top);
            }
        }else{ // same as case 1
            while(!q2.isEmpty()){
                top = q2.remove();
                q1.add(top);
            }
        }
        return top;  // return the variable top to main function
    }
    }
    
    public static void main(String[] args) {
        s2q q1 = new s2q();
        q1.add(0);
        q1.add(55);
        q1.add(4);
        q1.add(2);

        System.out.println(q1.peek());
    }
}
