import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public final class Expression {
    private final String input;
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBracket = Arrays.asList(')', '>', ']', '}');

    public Expression(String input) {
        this.input = input;
    }

    public boolean isBalanced() {
        Stack<Character> stack = new Stack<>();

        // Loop for characters in input, And check for open/closing bracket
        for (char ch : this.input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
//    return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRightBracket(char ch) {
        return rightBracket.contains(ch);
//    return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private boolean bracketMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBracket.indexOf(right);

//    return (right == ')' && left != '(') ||
//      (right == '>' && left != '<') ||
//      (right == ']' && left != '[') ||
//      (right == '}' && left != '{');
    }

    public static void main(String[] args) {
        String str = " <{[ 1 + 2 ]}>"; // is balanced or not

        Expression ex = new Expression(str);
        System.out.println(ex.isBalanced());

//    var value = ex.isBalanced(str);
//    System.out.println("value => " + value);
    }

}
