import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    var list = new MyLinkedList();
    System.out.println("Size: " + list.size()); // 0

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addFirst(11);

    System.out.println("Size: " + list.size()); // 0

    System.out.println(list.indexOf(30)); // 2
    System.out.println(list.indexOf(50)); // -1

    System.out.println(list.contains(30)); // true
    System.out.println(list.contains(11)); // true
    System.out.println(list.contains(55)); // false

    list.removeFirst();
    System.out.println(list.contains(11)); // false

    list.removeLast();
    System.out.println(list.contains(30)); // false

    System.out.println("Size: " + list.size()); // 2

    var arr1 = list.toArray();
    System.out.println("arr1: " + Arrays.toString(arr1));

    list.addLast(30);
    list.addLast(40);
    list.addLast(50);

//    list.reverse();
//    var reverseArr1 = list.toArray();
//    System.out.println("Reversed Arr1 " + Arrays.toString(reverseArr1));

    System.out.println("SIZE: " + list.size());

    System.out.println(list.getKthFromTheEnd(1)); // 50 is the last node in list
    System.out.println(list.getKthFromTheEnd(2)); // 40
    System.out.println(list.getKthFromTheEnd(5)); // 10 the first node

//    System.out.println(list.getKthFromTheEnd(10)); // IllegalArgumentException

    System.out.println(list.getKthFromTheEnd(0));

  }
}
