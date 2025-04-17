import java.util.NoSuchElementException;

public class MyLinkedList {
  private class Node {
    private int value;
    private Node next;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node first;
  private Node last;
  private int size;

  public void addLast(int item) {
    var node = new Node(item);
    if (isEmpty())
      first = last = node;
    else {
      last.next = node;
      last = node;
    }

    size++;
  }

  public void addFirst(int item) {
    var node = new Node(item);
    if (isEmpty())
      first = last = node;
    else {
      node.next = first;
      first = node;
    }

    size++;
  }

  public int indexOf(int item) {
    int index = 0;
    var current = first;
    while (current != null) {
      if (current.value == item) return index;
      current = current.next;
      index++;
    }
    return -1;
  }

  public boolean contains(int item) {
//    var current = first;
//    while (current != null){
//      if(current.value == item) return true;
//      current = current.next;
//    }
//    return false;

    return indexOf(item) != -1;
  }

  public void removeFirst() {
    if (isEmpty())
      throw new NoSuchElementException();

    // Check if list have "one element"
    if (first == last)
      first = last = null;
    else {
      // [10  20 -> 30]
      var second = first.next;
      first.next = null;
      first = second;
    }
    size--;
  }

  public void removeLast() {
    if (isEmpty())
      throw new NoSuchElementException();

    // Statement if list have ONE item
    if (first == last)
      first = last = null;
    else {
      // [10 -> 20 -> 30]
      // previous -> 20
      // last -> 30
      var previous = getPrevious(last);
      last = previous;
      last.next = null;
    }
    size--;
  }

  public int size() {
    return size;
  }

  private Node getPrevious(Node node) {
    var current = first;
    while (current != null) {
      if (current.next == node)
        return current;
      current = current.next;
    }
    return null;
  }

  private boolean isEmpty() {
    return first == null;
  }

  public int[] toArray() {
    int[] array = new int[size];
    var current = first;
    var index = 0;
    while (current != null) {
      array[index++] = current.value;
      current = current.next;
    }

    return array;
  }

  public void reverse() {
    // first         last
    // [ 10 -> 20 -> 30]
    // prev   curr   nex
    // nex = curr.next
    // curr.next = prev
    // last          first
    // [ 10 <- 20 <- 30]

    if (isEmpty()) return;

    var previous = first;
    var current = first.next;
    while (current != null) {
      var next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }

    last = first;
    last.next = null;
    first = previous;
  }

  public int getKthFromTheEnd(int k) {
    // [10 -> 20 -> 30 -> 40 -> 50]  k=3
    //              a           b
    // 1) Put pointer a, b at the right position

//    if (k > size)
//      throw new IllegalArgumentException();

    if (isEmpty())
      throw new IllegalStateException();

    var a = first;
    var b = first;
    for (int i = 1; i < k; i++) {
      b = b.next;
      // Validate if k > size
      if (b == null)
        throw new IllegalArgumentException();
    }

    // 2) Move pointers 'a to the target' and 'b to the end'
    while (b != last) {
      a = a.next;
      b = b.next;
    }

    return a.value;
  }
}
