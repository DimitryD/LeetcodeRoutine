package interview.zalando;

import java.util.EmptyStackException;
import java.util.Stack;

public class Task2 {

    // max machine integer
    private final int MAX_INTEGER = 1048575;

    public int solution(String S) {
        // if empty string then return error
        if (S.isEmpty()) return -1;
        Stack<Integer> stack = new Stack<>();
        // variables to temporary store values from the stack
        int first, second;
        try {
            // split S by ' ' and iterate through all commands
            for (String command: S.split(" ")) {
                switch (command) {
                    case "+": // sums 2 topmost elements of the stack and pushes result
                        first = stack.pop();
                        second = stack.pop();
                        int sum = first + second;
                        // return error in case of overflow
                        if (sum > MAX_INTEGER) return -1;
                        stack.push(sum);
                        break;
                    case "-": // subtract 2 topmost elements of the stack and pushes difference
                        first = stack.pop();
                        second = stack.pop();
                        int difference = first - second;
                        // return error in case of underflow
                        if (difference < 0) return -1;
                        stack.push(difference);
                        break;
                    case "DUP": // duplicate the top element of the stack
                        first = stack.pop();
                        stack.push(first);
                        stack.push(first);
                        break;
                    case "POP": // pop the top element from the stack
                        stack.pop();
                        break;
                    default: // pushes the integer into the stack (works because integer is last legal command for the program)
                        stack.push(Integer.parseInt(command));
                }
            }
        } catch (EmptyStackException e) {
            // Handle exception when we tried to pop from empty stack in one place
            return -1;
        }
        // check if stack is empty before returning result
        return stack.isEmpty() ? -1 : stack.pop();
    }
}
