import java.util.Arrays;

public class Stack {
    private int[] stack;
    private int index = -1;

    Stack(int size){
        stack = new int[size];
    }

    void push(int number){
        index++;
        stack[index] = number;
    }

    int pop(){
        int out = stack[index];
        stack[index] = 0;
        index--;
        return out;
    }

    int peek(){
        return stack[index];
    }

    void printStack(){
        System.out.println(Arrays.toString(stack));
    }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.printStack();
        stack.push(1);
        stack.printStack();
        stack.push(2);
        stack.printStack();
        stack.push(3);
        stack.printStack();

        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}
