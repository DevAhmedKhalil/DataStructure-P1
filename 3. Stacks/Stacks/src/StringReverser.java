import java.util.Stack;

public class StringReverser {

  public String reverse(String input) {
    if (input == null)
      throw new IllegalArgumentException();

    //1) Create stack of characters
    Stack<Character> stack = new Stack<>();

    //2) Loop in input and push chars in stack
    for (char ch : input.toCharArray())
      stack.push(ch);
//    for (int i = 0; i < input.length(); i++) {
//      stack.push(input.charAt(i));
//    }

    //3) Make var to store the reversed input
    StringBuilder reversed = new StringBuilder();
    while (!stack.empty())
      reversed.append(stack.pop());
//    var reversed = "";
//    while (!stack.empty()) {
//      reversed += stack.pop();
//    }

    return reversed.toString();
  }

  public static void main(String[] args) {

    String str = "abcd";
    StringReverser reverser = new StringReverser();
    var result = reverser.reverse(str);
    System.out.println(result);

  }
}