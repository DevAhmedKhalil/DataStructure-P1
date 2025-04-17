import java.util.ArrayDeque;
import java.util.Queue;

public class _Main {
  public static void main(String[] args) {

    Queue<Integer> queue = new ArrayDeque<>();
    queue.add(10);
    queue.add(20);
    queue.add(30);
    queue.add(40);
    System.out.println("queue = " + queue);
    //--------------------------------------------------
    var front = queue.remove();
    System.out.println("front = " + front);
    System.out.println("queue after remove = " + queue);
    //--------------------------------------------------
    ReverseQueue.reverse(queue);
    System.out.println("reversed queue = " + queue);
    //--------------------------------------------------

  }
}