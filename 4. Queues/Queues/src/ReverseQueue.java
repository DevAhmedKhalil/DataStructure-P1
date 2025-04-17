import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
  public static void reverse(Queue<Integer> queue){
    // only use ==> add, remove, isEmpty  --> hint: reversing a string
    // Queue [10, 20, 30]
    // Stack [, , ]

    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty())
      stack.push(queue.remove());
    // Queue [, , ]
    // Stack [10, 20, 30]

    while (!stack.empty()){
      var top = stack.pop();
      queue.add(top);
    }
    // Queue [30, 20, 10]
    // Stack [, , ]

  }
}
