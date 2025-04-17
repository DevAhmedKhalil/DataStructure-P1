import java.util.Arrays;
import java.util.LinkedList;

public class JavaLinkedList {

  public static void main(String[] args) {
//    LinkedList list = new LinkedList();
    LinkedList<Integer> list = new LinkedList<>();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(10);
    list.removeLast();
    list.addFirst(5);
    System.out.println(list.contains(10));
    System.out.println(list.indexOf(20));
    System.out.println(list.lastIndexOf(10));
    System.out.println(list);

    var array = list.toArray();
    System.out.println(Arrays.toString(array));
  }
}
