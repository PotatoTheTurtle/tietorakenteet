import java.util.Arrays;

public class Queue {
    private int[] queue;
    private int n;
    private int head = 0;
    private int tail = 0;

    Queue(int size){
        n = size;
        queue = new int[size];
    }

    void add(int number){
        queue[tail] = number;
        tail++;
        if(tail == n){
            tail = 0;
        }
    }

    int remove(){
        int out = queue[head];
        queue[head] = 0;
        head++;

        if(head == n){
            head = 0;
        }
        return out;
    }

    void printQueue(){
        System.out.println(Arrays.toString(queue));
    }

    public static void main(String[] args) {
        Queue queue = new Queue(6);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.printQueue();

        queue.remove();

        queue.printQueue();

        queue.add(4);

        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();

        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.printQueue();

        queue.remove();
        queue.printQueue();
        queue.remove();
        queue.printQueue();
        queue.remove();

        queue.printQueue();

    }

}
