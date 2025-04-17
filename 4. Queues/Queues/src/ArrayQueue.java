import java.util.Arrays;

public class ArrayQueue {

  private int[] items;
  private int front;
  private int rear;
  private int count;

  public ArrayQueue(int capacity) {
    items = new int[capacity];
  }

  public void enqueue(int item) {
    if (count == items.length)
      throw new IllegalStateException();

    items[rear++] = item;
    count++;
  }

  public int dequeue() {
    var item = items[front];
    items[front++] = 0;
//    front++;
    return item;

//    return items[front++];
  }

  @Override
  public String toString() {
    return Arrays.toString(items);
  }

  public static void main(String[] args) {
    ArrayQueue queue = new ArrayQueue(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    System.out.println("queue = " + queue);

    var front1 = queue.dequeue();
    System.out.println("front1 = " + front1 + " removed");

    var front2 = queue.dequeue();
    System.out.println("front2 = " + front2 + " removed");

    System.out.println("queue = " + queue);
  }
}

// class => ArrayQueue (ArrayDeque) DoubleEndedQueue
// enqueue -> adds an element to the back of the queue./
// dequeue -> removes and returns the front element from the queue.
// peek
// isEmpty
// isFull
// [10, 20, 30, 40, 0]
//      F       R