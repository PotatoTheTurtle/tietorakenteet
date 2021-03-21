import java.util.ArrayList;
import java.util.Arrays;

public class Queue {
    private ArrayList<String> queue;

    Queue(){
        queue = new ArrayList<>();
    }

    void add(String string){
        queue.add(string);
    }

    String remove(){
        return queue.remove(0);
    }

    void printQueue(){
        System.out.println(queue);
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("1");
        queue.add("2");
        queue.add("3");

        queue.printQueue();

        queue.remove();

        queue.printQueue();

        queue.add("4");

        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();

        queue.add("5");
        queue.add("6");
        queue.add("7");
        queue.add("8");
        queue.printQueue();

        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();

        queue.printQueue();

    }

}
