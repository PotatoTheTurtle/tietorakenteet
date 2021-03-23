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
        queue.printQueue();
        queue.add("tänään");
        queue.printQueue();
        queue.add("on");
        queue.printQueue();
        queue.add("torstai");
        queue.printQueue();

        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();


    }

}
