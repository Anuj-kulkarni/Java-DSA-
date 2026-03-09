import java.util.*;

public class stockSpan {

    public static void StockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>(); 
        span [0] = 1; // deafult value of the span array
        s.push(0); // stack s is just supportive data structure to solve the problem 

        for(int i=1; i<stocks.length; i++){ // run loop from 1 to n-1
            int currprice = stocks[i]; // consider the value as default 
            while(!s.isEmpty() && currprice > stocks[s.peek()]){
                s.pop(); // pop if the curr value of stock is greater than the currPrice 
            }
            if(s.isEmpty()){
                span[i] = i+1; // only when the last stock is remaining i.e n-1
            }else{
                int prevHigh = s.peek(); // find the highest among the stack and set it as Highest value
                span[i] = i - prevHigh; // calculate the span value using this formula
                // span = current value of stock - last highest value of the stock
            }
            s.push(i); // just push all of them to stack 
        }

        return;
    }

    public static void printStack(int span[]){
        for(int i=0; i<span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
    public static void main(String[] args) {

        int stocks [] = {100, 80, 60, 70, 60, 85, 100};
        int span [] = new int[stocks.length]; 
        StockSpan(stocks, span);
        printStack(span);
    }
}
