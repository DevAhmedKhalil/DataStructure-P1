import java.util.Arrays;

public class TwoStacksInArray {
  private final int[] array;
  private int top1;
  private int top2;

  public TwoStacksInArray(int capacity) {
    array = new int[capacity];
    top1 = -1;  // Initialize top pointer for stack 1
    top2 = capacity;  // Initialize top pointer for stack 2 at the end of the array
  }

  public void push1(int item) {
    if (top1 < top2 - 1)
      array[++top1] = item;

    else
      System.out.println("Stack 1 if Full");
  }

  public void push2(int item) {
    if (top2 > top1 + 1)
      array[--top2] = item;

    else
      System.out.println("Stack 2 is Full");
  }

  public int pop1() {
    if (top1 >= 0)
      return array[top1--];

    else {
      System.out.println("Stack 1 is Empty");
      return -1;
    }
  }

  public int pop2() {
    if (top2 < array.length)
      return array[top2++];

    else {
      System.out.println("Stack 2 is Empty");
      return -1;
    }
  }

  public boolean isEmpty1() {
    return top1 == -1;
  }

  public boolean isEmpty2() {
    return top2 == array.length;
  }

  @Override
  public String toString() {
    return Arrays.toString(array);

//    var content1 = Arrays.copyOfRange(array, 0, top1 + 1);
//    var content2 = Arrays.copyOfRange(array, top2, array.length);
//
//    var content = new int[content1.length + content2.length];
//    System.arraycopy(content1, 0, content, 0, content1.length);
//    System.arraycopy(content2, 0, content, content1.length, content2.length);
//
//    return Arrays.toString(content);
  }

  public static void main(String[] args) {
    TwoStacksInArray twoStacks = new TwoStacksInArray(10);

    twoStacks.push1(1);
    twoStacks.push1(2);
    twoStacks.push1(3);

    twoStacks.push2(10);
    twoStacks.push2(9);
    twoStacks.push2(8);
    twoStacks.push2(7);
    twoStacks.push2(6);
    twoStacks.push2(5);
    twoStacks.push2(4);
//    twoStacks.push2(3); // Stack 2 is Full

    System.out.println(twoStacks);

    System.out.println("Pop from Stack1: " + twoStacks.pop1());
    System.out.println("Pop from Stack2: " + twoStacks.pop2());
    System.out.println("Pop from Stack2: " + twoStacks.pop2());

    twoStacks.push1(33);
    twoStacks.push2(55);
    twoStacks.push2(44);

    System.out.println(twoStacks);

    twoStacks.push1(333);
    twoStacks.push2(444);

    System.out.println("Pop from Stack1: " + twoStacks.pop1());
    System.out.println("Pop from Stack1: " + twoStacks.pop1());
    System.out.println("Pop from Stack1: " + twoStacks.pop1());
    System.out.println("Stack1 Empty? " + twoStacks.isEmpty1());

    System.out.println(twoStacks);
    // The stack1 is empty but when you print it the values will stay the same
    // because top moves and reAssign the value
  }
}
