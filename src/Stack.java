import java.util.ArrayList;
import java.util.Arrays;

public class Stack {
    private ArrayList<String> stack;
    private int index = -1;

    Stack(){
        stack = new ArrayList<>();
    }

    void push(String string){
        index++;
        stack.add(index, string);
    }

    String pop(){
        String out = stack.remove(index);
        index--;
        return out;
    }

    String peek(){
        return stack.get(index);
    }

    void printStack(){
        System.out.println(stack);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.printStack();
        stack.push("1");
        stack.printStack();
        stack.push("2");
        stack.printStack();
        stack.push("3");
        stack.printStack();

        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
    }
}
