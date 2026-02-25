import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String input = "Level";
        PalindromeStrategy strategy;
        strategy = new StackStrategy();
        boolean result = strategy.check(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(Character.toLowerCase(c));
        }
        for (char c : input.toCharArray()) {
            if (Character.toLowerCase(c) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}