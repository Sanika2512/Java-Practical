import java.util.*;
interface Stack {
    void push(int item);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    private int[] stack;
    private int top;
    private int size;

    public IntegerStack(int size) {
        this.size = size;
        this.stack = new int[size];
        this.top = -1;
    }

    @Override
    public void push(int item) {
        if (overflow()) {
            System.out.println("Stack Overflow! cannot Perform push operation " + item);
        } else {
            stack[++top] = item;
            System.out.println("Pushed: " + item);
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! cannot Perform pop operation .");
            return -1; 
        } else {
            System.out.println("Popped: " + stack[top]);
            return stack[top--];
        }
    }

    @Override
    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean overflow() {
        return top == size - 1;
    }

    @Override
    public boolean underflow() {
        return top == -1;
    }
}

public class StackTest {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack(5);

        stack.pop(); 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        
        stack.pop();
        stack.display();

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70); 
        stack.display();
    }
}
