package Q1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean isValid = checkString(input);
        if (isValid){
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    private static boolean checkString(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!checkClosed(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean checkClosed(char open, char close) {
        
        if (open == '(' && close == ')') return true;
        if (open == '[' && close == ']') return true;
        if (open == '{' && close == '}') return true;
        return false;
    }

}
