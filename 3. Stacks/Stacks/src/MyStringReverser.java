import java.util.Stack;

public class MyStringReverser {
  public static void main(String[] args) {

    // TODO: Reverse this string using "Stack"
    String str = "abcd";
    Stack<String> stack = new Stack<>();

    //1) Push chars to stack
    for (int i = 0; i < str.length(); i++) {
//      System.out.println(str.charAt(i));
      stack.push(String.valueOf(str.charAt(i)));
    }

    //2) Pop chars from stack "LIFO" last in first out
    StringBuilder reversedStr = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      reversedStr.append(stack.pop());
    }
    System.out.print(reversedStr);

  }
}
