import edu.princeton.cs.algs4.*;

public class Parentheses {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>();
		while (StdIn.hasNextChar()) {
            char c = StdIn.readChar();
            switch(c) {
                case '\u007B':
                case '\u005B':
                case '\u0028': s.push(c);
                               break;
                case '\u007D': 
                    if (s.pop() != '\u007B') {
                        StdOut.println("'" + c + "' is not match.");
                        return;
                    }
                    break;
                case '\u005D': 
                    if (s.pop() != '\u005B') {
                        StdOut.println("'" + c + "' is not match.");
                        return;
                    }
                    break;
                case '\u0029': 
                    if (s.pop() != '\u0028') {
                        StdOut.println("'" + c + "' is not match.");
                        return;
                    }
                    break;
                default:
                    break;
            }
		}
        StdOut.println("All match!");
	}
}
