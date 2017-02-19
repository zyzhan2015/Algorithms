import edu.princeton.cs.algs4.*;

public class Parentheses {
	public static void main(String[] args) {
		Stack<Character> s = new Stack<Character>;
		while (StdIn.hasNextChar()) {
            Char c = StdIn.readChar();
            if (c == '\u007B' || c == '\u005B' || c == '\u0028') {
				s.push(c);
			} else if (c == '\u007D' || c == '\u005D' || c == '\u0029') {
                
            }
		}
	}
}
