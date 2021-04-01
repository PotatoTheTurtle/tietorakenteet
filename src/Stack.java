import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Stack implements Iterable {
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


    @Override
    public Iterator iterator(){
        return new Iterator<>(){

            private int currentIndex = -1;

            @Override
            public boolean hasNext() {
                return currentIndex < stack.size() - 1;
            }

            @Override
            public String next() {
                currentIndex++;
                return stack.get(currentIndex);
            }
        };
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
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
