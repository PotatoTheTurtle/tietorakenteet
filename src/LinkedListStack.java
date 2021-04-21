import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStack {

    private LinkedList<String> stack;
    private int index = -1;

    LinkedListStack(){
        stack = new LinkedList<>();
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



    public Iterator iterator(){
        return stack.iterator();
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.printStack();
        stack.push("tänään");
        stack.printStack();
        stack.push("on");
        stack.printStack();
        stack.push("tiistai");
        stack.printStack();


        Iterator stackIterator = stack.iterator();

        while (stackIterator.hasNext()) {
            System.out.println(stackIterator.next());
        }

        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.pop();
        stack.printStack();
    }

}
