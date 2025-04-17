public class LinkedListsExercises {

  public static class Linked_List {

    private static class Node {
      private final int value;
      private Node next;

      public Node(int value) {
        this.value = value;
      }
    }

    private Node first;
    private Node last;

    public void addLast(int item) {
      var node = new Node(item);

      if (first == null)
        first = last = node;

      else {
        last.next = node;
        last = node;
      }
    }

    public void printMiddle() {
      if (first == null) {
        System.out.println("The linked list is empty.");
        return;
      }

      Node slow = first;
      Node middleOne = null;
      Node fast = first;

      //ensures that we can safely move fast by two steps at a time without encountering NullPointerException, and it also allows us to detect when we've reached the end of the linked list or when we've reached the last two nodes of the list.
      while (fast != null && fast.next != null) {
        middleOne = slow;
        slow = slow.next;
        fast = fast.next.next;
      }

      if (fast == null) {
        // The list has even numbers of nodes, print both middle nodes
        System.out.println("Middle of the linked list: [" + middleOne.value + ", " + slow.value + "]");
      } else {
        // The list has odd number of nodes, print the single middle node
        System.out.println("Middle of the linked list: " + slow.value);
      }
    }

    public void printMIDDLE() {
      if (first == null) throw new IllegalStateException();

      var a = first;
      var b = first;
      while (b != last && b.next != last) {
        b = b.next.next;
        a = a.next;
      }
      if (b == last)
        System.out.println(a.value);
      else
        System.out.println(a.value + ", " + a.next.value);
    }

    public static boolean hasLoop(Node head) {
      if (head == null) return false;

      Node slow = head;
      Node fast = head;

      while (fast != null && fast.next != null) {
        slow = slow.next; // Move slow pointer by one step
        fast = fast.next.next; // Move fast pointer by two steps

        // If fast and slow pointers meet, there's a loop
        if (fast == slow) {
          return true;
        }
      }

      // If fast reaches the end of the list, there's no loop
      return false;
    }

  }

  public static void main(String[] args) {
    Linked_List list = new Linked_List();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);

    list.printMiddle();
    list.printMIDDLE();

    // Create a linked list with a loop for testing
    Linked_List.Node head = new Linked_List.Node(1);
    head.next = new Linked_List.Node(2);
    head.next.next = new Linked_List.Node(3);
    head.next.next.next = new Linked_List.Node(4);
//    head.next.next.next.next = head.next; // Create a loop

    // Check if the linked list has a loop
    boolean hasLoop = Linked_List.hasLoop(head); // Call hasLoop method on the list instance
    System.out.println("Does the linked list have a loop? " + hasLoop);
  }
}