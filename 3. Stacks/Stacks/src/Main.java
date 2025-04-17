import java.util.Arrays;
import java.util.Stack;

public class Main {
  public static void main(String[] args) {

    Stack<Integer> stack = new Stack<>();
    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack);

    var topAfterPop = stack.pop();
    System.out.println("DELETED : " + topAfterPop);
    System.out.println(stack);

    var topOfStack = stack.peek();
    System.out.println("top of the stack : " + topOfStack);
    System.out.println(stack);

    // ------------------------------------------------------
    String str = "ahmed";
    StringReverser reverser = new StringReverser();
    var result = reverser.reverse(str);
    System.out.println(result);
    // ------------------------------------------------------



  }
}
