// Time Complexity : O(1)
// Space Complexity : O(1)

class Stack {
    //Please read sample.java file before starting.
  //Kindly include Time and Space complexity at top of each file
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    {
        if( this.top < MAX-1){
            return true;
        }else{
            return false;
        }
    } 

    Stack() 
    {
        top = -1;
    } 
  
    boolean push(int x) 
    {
        if(isEmpty()){
            top =+ 1;
            a[top] = x;
            return true;
        }else{
            return false;
        }
    } 
  
    int pop() 
    {
        if (top == -1) {
            System.out.println(" Stack Underflow");
            return 0;
        }else{
            return a[top--];
        }
    } 
  
    int peek() 
    {
        if (top == -1) {
            System.out.println(" Stack Underflow");
            return 0;
        }else{
            return a[top];
        }
    } 
} 
  
// Driver code 
public class Exercise_1 {
    public static void main(String args[]) 
    {

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");

    } 
}
