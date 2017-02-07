import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class TwentyOne {
	public static void main(String[] args) {
		while (!StdIn.isEmpty()) {
			String name = StdIn.readString();
			int num1 = StdIn.readInt();
			int num2 = StdIn.readInt();
			double di = (double)num1 / (double)num2; 
			StdOut.printf("%s %d %d %.3f\n", name, num1, num2, di);
		}
	}
}