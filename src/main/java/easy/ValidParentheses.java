package easy;

import java.util.Stack;

public class ValidParentheses {
    // https://leetcode.com/problems/valid-parentheses/
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                parentheses.push(c);
            else if (parentheses.isEmpty())
                return false;
            else {
                char prev = parentheses.peek();
                if ((prev == '(' && c == ')') || (prev == '{' && c == '}') || (prev == '[' && c == ']'))
                    parentheses.pop();
                else return false;
            }
        }
        return parentheses.isEmpty();
    }
}
