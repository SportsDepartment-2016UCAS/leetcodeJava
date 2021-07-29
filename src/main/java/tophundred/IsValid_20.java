package tophundred;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid_20 {

    public static boolean isValid(String s) {

        Map<Character, Integer> left = new HashMap<>();
        left.put('(', 1);
        left.put('[', 2);
        left.put('{', 3);

        Map<Character, Integer> right = new HashMap<>();
        right.put(')', 1);
        right.put(']', 2);
        right.put('}', 3);

        if (s == null) {
            return false;
        }

        boolean res = true;
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray())  {
            if (left.containsKey(c)) {
                stack.push(left.get(c));
            } else {
                if (stack.size() < 1 || !stack.pop().equals(right.get(c))) {
                    res = false;
                    return res;
                }
            }
        }

        if (stack.size() > 0) {
            res = false;
        }

        return res;
    }


    public static void main(String[] args) {

        String a = "{[]}";
        boolean valid = IsValid_20.isValid(a);
        System.out.println(valid);

    }


}
