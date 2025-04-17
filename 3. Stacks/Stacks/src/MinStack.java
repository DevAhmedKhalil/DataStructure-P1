import java.util.Arrays;
import java.util.Stack;
public class MinStack {
  private final Stack<Integer> mainStack;
  private final Stack<Integer> minStack;

  public MinStack() {
    mainStack = new Stack<>();
    minStack = new Stack<>();
  }

  public void push(int item) {
    int min = item;

    if (!minStack.isEmpty() && min > minStack.peek())
      min = minStack.peek();

    minStack.push(min);
    mainStack.push(item);

    // Print the contents of the mainStack
//    System.out.println("MainStack after push: " + Arrays.toString(mainStack.toArray()));
//    System.out.println("MinStack after push: " + Arrays.toString(minStack.toArray()));
  }

  public int pop() {
    if (mainStack.isEmpty()) throw new IllegalStateException("Stack is empty");

    minStack.pop();
    return mainStack.pop();
  }

  public int top() {
    if (mainStack.isEmpty()) throw new IllegalStateException("Stack is empty");

    return mainStack.peek();
  }

  public int getMin() {
    if (minStack.isEmpty()) throw new IllegalStateException("Stack is empty");

    return minStack.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();

    minStack.push(4);
    minStack.push(5);
    minStack.push(8);
    minStack.push(2);
    minStack.push(1);

    System.out.println("Minimum Element from Stack: " + minStack.getMin());

    System.out.println("Popped item: " + minStack.pop());

    System.out.println("Minimum Element from Stack: " + minStack.getMin());

    System.out.println("Popped item: " + minStack.pop());

    System.out.println("Minimum Element from Stack: " + minStack.getMin());

  }

}