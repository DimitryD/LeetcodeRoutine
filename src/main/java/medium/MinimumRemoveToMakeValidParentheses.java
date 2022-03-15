package medium;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    // https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
    public String minRemoveToMakeValid(String s) {
        // (abc)(d))(abc()
        // )()(
        // stack: (

        // "))((sd()))(("
        //              |
        Stack<Character> pairs = new Stack<>(); // ((
        StringBuilder result = new StringBuilder(); // ((sd()))((
        for (Character c: s.toCharArray()) {
            if (c == '(') {
                pairs.add(c);
                result.append(c);
            } else if (c == ')') {
                if (!pairs.isEmpty()) {
                    pairs.pop();
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }
        if (!pairs.isEmpty()) {
            for (int i = 0; i < pairs.size(); i++) {
                int index = result.lastIndexOf("(");
                result.delete(index, index + 1);
            }
        }
        return result.toString();
    }

    public String minRemoveToMakeValidWithoutStack(String s) {
        StringBuilder result = new StringBuilder();
        int prefix = 0, suffix = 0;
        char[] chars = s.toCharArray();
        int n = chars.length - 1;
        for (int i = 0; i <= n; i++) {
            if (chars[i] == '(')
                prefix++;
            if (chars[i] == ')') {
                if (prefix == 0)
                    chars[i] = '!';
                else prefix--;
            }
        }
        for (int i = n; i >= 0; i--) {
            if (chars[i] == ')')
                suffix++;
            if (chars[i] == '(') {
                if (suffix == 0)
                    chars[i] = '!';
                else suffix--;
            }
        }
        for (Character c: chars)
            if (c != '!')
                result.append(c);

        return result.toString();
    }
}
