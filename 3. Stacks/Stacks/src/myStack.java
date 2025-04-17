import java.util.Arrays;

public class myStack {

  private final int[] array;
  private int top;
  private final int capacity;

  public myStack(int capacity) {
    this.capacity = capacity;
    this.array = new int[capacity];
    this.top = -1;
  }

  public void push(int element) {
    if (top == capacity - 1) {
      System.out.println("Stack overflow: Cannot push element onto a full stack.");
      return;
//      throw new StackOverflowError();
    }

    top++;
    array[top] = element;
    System.out.println("Pushed Element: " + element);
  }

  public int pop() {
    if (isEmpty()) {
      System.out.println("Stack underflow: Cannot pop element from an empty stack.");
      return -1;
//      throw new IllegalStateException();
    }

    int poppedElement = array[top];
    top--;
    System.out.println("Popped Element: " + poppedElement);
    return poppedElement;
  }

  public int peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty: Cannot peek.");
      return -1;
//      throw new IllegalStateException();
    }

    return array[top];
  }

  public boolean isEmpty() {
    return top == -1;
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }

  public static void main(String[] args) {
    // Create a stack with a capacity of 5
    myStack myStack = new myStack(5);

    // Test pushing elements onto the stack
    myStack.push(1);
    myStack.push(2);
    myStack.push(3);
    myStack.push(4);
    myStack.push(5);

    System.out.println(myStack);

    // Test pushing onto a full stack (should print stack overflow)
    myStack.push(6);

    // Test peeking at the top element
    int topElement = myStack.peek();
    System.out.println("Top element of the stack: " + topElement);

    // Test popping elements from the stack
    int poppedElement1 = myStack.pop();
    int poppedElement2 = myStack.pop();
    int poppedElement3 = myStack.pop();
    int poppedElement4 = myStack.pop();
    int poppedElement5 = myStack.pop();

    // Test popping from an empty stack (should print stack underflow)
    int poppedElement6 = myStack.pop();

    // Print popped elements
    System.out.println("Popped elements: " + poppedElement1 + ", " + poppedElement2 + ", " +
      poppedElement3 + ", " + poppedElement4 + ", " + poppedElement5);

    // Test peeking from an empty stack (should print stack is empty)
    int topElementEmptyStack = myStack.peek();

    // Test isEmpty method
    boolean empty = myStack.isEmpty();
    System.out.println("Is stack empty? " + empty);

  }
}
